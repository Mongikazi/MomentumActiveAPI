package com.momentum.api.implementation;


import com.momentum.api.models.Customer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetAllCustomers {
    public GetAllCustomers() {
    }

    public List<Customer> customerConverter(List<com.momentum.api.Infrastructure.models.Customer> customers) throws IOException {
        List<com.momentum.api.models.Customer> customerList = new ArrayList<>();
        customers = new com.momentum.api.Infrastructure.implementation.GetAllCustomers().getAllCustomers();
        for (com.momentum.api.Infrastructure.models.Customer customer : customers) {
            com.momentum.api.models.Customer customerModel = new com.momentum.api.models.Customer(customer.getId(),
                    customer.getName(), customer.getActiveDays(), customer.getPoints());
            customerList.add(customerModel);
        }
        return customerList;
    }
}
