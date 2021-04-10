package com.momentum.api.implementation;

import com.momentum.api.Infrastructure.models.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetAllProducts {
    public GetAllProducts() {
    }

    public List<com.momentum.api.models.Product> productsConverter(List<Product> products) throws IOException {
        List<com.momentum.api.models.Product> productsList = new ArrayList<>();
        products = new com.momentum.api.Infrastructure.implementation.GetAllProducts().getAllProducts();
        for (Product product : products) {
            com.momentum.api.models.Product productModel = new com.momentum.api.models.Product(product.getId(),
                    product.getCode(), product.getName(), product.getDescription(), product.getPrice());
            productsList.add(productModel);
        }
        return productsList;
    }
}
