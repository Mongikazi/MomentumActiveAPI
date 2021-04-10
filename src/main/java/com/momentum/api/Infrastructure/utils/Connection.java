package com.momentum.api.Infrastructure.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Connection {
    Properties properties;

    public Connection() {
        properties = new Properties();
        try {
            FileInputStream fileInput = new FileInputStream(System.getProperty("user.dir")
                    + "//src//test//resources//config/" + "application.properties");
            properties.load(fileInput);

        } catch (IOException e) {
            e.printStackTrace();

        }

        connection();
    }

    public void connection() {
        String connectionString = System.getProperty(properties.getProperty("-Dmongodb.uri="));
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            List<Document> databases = mongoClient.listDatabases().into(new ArrayList<>());
            databases.forEach(db -> System.out.println(db.toJson()));
        }
    }
}
