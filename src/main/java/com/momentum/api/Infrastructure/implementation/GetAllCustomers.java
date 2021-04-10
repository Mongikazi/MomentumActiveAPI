package com.momentum.api.Infrastructure.implementation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.momentum.api.Infrastructure.models.Customer;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class GetAllCustomers {
    public Properties properties;
    public List<Customer> getAllCustomers() throws IOException {
        List<Customer> customersList = new ArrayList<>();
        getPropertyValue("/application.properties");
        String connectionString = System.getProperty("mongodb.uri");

        System.out.println(connectionString);
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase momentumdb = mongoClient.getDatabase("momentumdb");
            MongoCollection<Document> customers = momentumdb.getCollection("Customer");

            Document document = customers.find(new Document("Id", "1233")).first();
            Customer customer1 = toCustomer(document);
            customersList.add(customer1);

            Document document1 = customers.find(new Document("Id", "9")).first();
            Customer customer2 = toCustomer(document1);
            customersList.add(customer2);

            Document document2 = customers.find(new Document("Id", "098")).first();
            Customer customer3 = toCustomer(document2);
            customersList.add(customer3);

            Document document3 = customers.find(new Document("Id", "789")).first();
            Customer customer4 = toCustomer(document3);
            customersList.add(customer4);

            Document document4 = customers.find(new Document("Id", "666")).first();
            Customer customer5 = toCustomer(document4);
            customersList.add(customer5);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return customersList;
    }


    private Customer toCustomer(Document document) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        String jsonString = document.toJson();
        Customer customer = mapper.readValue(jsonString, Customer.class);
        return customer;
    }

    public void getPropertyValue(String filename) {
        properties = new Properties();
        try {
            FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir")
                    + "//src//test//resources//config/" + filename);
            properties.load(fileInput);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
