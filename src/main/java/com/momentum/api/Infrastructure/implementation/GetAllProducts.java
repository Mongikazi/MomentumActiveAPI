package com.momentum.api.Infrastructure.implementation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.momentum.api.Infrastructure.models.Product;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetAllProducts {

    public List<Product> getAllProducts() throws IOException {
        List<Product> productList = new ArrayList<>();
        String connectionString = System.getProperty("mongodb.uri");
        if(connectionString == null || connectionString.isEmpty()){
            connectionString = "mongodb+srv://admin:Mongi2021@cluster0.wgqpd.mongodb.net/momentumdb?retryWrites=true&w=majority";
        }
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase sampleTrainingDB = mongoClient.getDatabase("momentumdb");
            MongoCollection<Document> products = sampleTrainingDB.getCollection("Product");

            Document document = products.find(new Document("Id", "1")).first();
            Product product = toProduct(document);
            productList.add(product);

            Document document1 = products.find(new Document("Id", "2")).first();
            Product product1 = toProduct(document1);
            productList.add(product1);

            Document document2 = products.find(new Document("Id", "3")).first();
            Product product2 = toProduct(document2);
            productList.add(product2);

            Document document3 = products.find(new Document("Id", "4")).first();
            Product product3 = toProduct(document3);
            productList.add(product3);

            Document document4 = products.find(new Document("Id", "5")).first();
            Product product4 = toProduct(document4);
            productList.add(product4);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return productList;
    }

    private Product toProduct(Document document) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        String jsonString = document.toJson();
        Product product = mapper.readValue(jsonString, Product.class);
        return product;
    }
}
