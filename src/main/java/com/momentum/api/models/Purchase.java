package com.momentum.api.models;

import io.swagger.annotations.ApiModelProperty;

public class Purchase {
    @ApiModelProperty(notes = "Purchase Id",name="id",required=true,value="test id")
    private String id;

    @ApiModelProperty(notes = "Purchase made Customer", name = "customer", required = true, value = "test customer")
    private String customer;

    @ApiModelProperty(notes = "List of Purchased Products", name = "products", required = true, value = "test products")
    private String products;

    public Purchase(String id, String customer, String products) {
        super();
        this.id = id;
        this.customer = customer;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}
