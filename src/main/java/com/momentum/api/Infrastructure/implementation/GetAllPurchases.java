package com.momentum.api.Infrastructure.implementation;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.momentum.api.Infrastructure.models.Purchase;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetAllPurchases {

    public GetAllPurchases() {
        super();
    }

    public List<Purchase> getAllPurchases() throws IOException {
        List<Purchase> purchaseList = new ArrayList<>();
        String connectionString = System.getProperty("mongodb.uri");
        if(connectionString == null || connectionString.isEmpty()){
            connectionString = "mongodb+srv://admin:Mongi2021@cluster0.wgqpd.mongodb.net/momentumdb?retryWrites=true&w=majority";
        }
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase sampleTrainingDB = mongoClient.getDatabase("momentumdb");
            MongoCollection<Document> purchases = sampleTrainingDB.getCollection("Purchase");

            Document document = purchases.find(new Document("Id", "1233")).first();
            Purchase purchase = toPurchase(document);
            purchaseList.add(purchase);

            Document document1 = purchases.find(new Document("Id", "789")).first();
            Purchase purchase1 = toPurchase(document1);
            purchaseList.add(purchase1);

            Document document2 = purchases.find(new Document("Id", "565")).first();
            Purchase purchase2 = toPurchase(document2);
            purchaseList.add(purchase2);

            Document document3 = purchases.find(new Document("Id", "17")).first();
            Purchase purchase3 = toPurchase(document3);
            purchaseList.add(purchase3);

            Document document4 = purchases.find(new Document("Id", "143")).first();
            Purchase purchase4 = toPurchase(document4);
            purchaseList.add(purchase4);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return purchaseList;
    }

    private Purchase toPurchase(Document document) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        mapper.setVisibility(VisibilityChecker.Std.defaultInstance().withFieldVisibility(JsonAutoDetect.Visibility.ANY));
        String jsonString = document.toJson();
        Purchase purchase = mapper.readValue(jsonString, Purchase.class);
        return purchase;
    }
}
