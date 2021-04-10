package com.momentum.api.implementation;


import com.momentum.api.Infrastructure.models.Purchase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetAllPurchases {
    public GetAllPurchases() {
    }

    public List<com.momentum.api.models.Purchase> purchasesConverter(List<Purchase> purchases) throws IOException {
        List<com.momentum.api.models.Purchase> purchaseList = new ArrayList<>();
        purchases = new com.momentum.api.Infrastructure.implementation.GetAllPurchases().getAllPurchases();
        for (com.momentum.api.Infrastructure.models.Purchase purchase : purchases) {
            com.momentum.api.models.Purchase purchaseModel = new com.momentum.api.models.Purchase(purchase.getId(),
                    purchase.getCustomer(), purchase.getProducts());
            purchaseList.add(purchaseModel);
        }
        return purchaseList;
    }
}
