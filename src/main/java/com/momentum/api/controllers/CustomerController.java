package com.momentum.api.controllers;

import com.momentum.api.implementation.GetAllCustomers;
import com.momentum.api.models.Customer;
import com.momentum.api.models.Purchase;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Api(value = "CustomerController", description = "Customer Controller REST API Methods")
@RestController
public class CustomerController {

    List<Customer> customers = new ArrayList<>();

    @ApiOperation(value = "Get list of Customers in the System ", response = Iterable.class, tags = "customers")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "SUCCESS!"),
            @ApiResponse(code = 401, message = "NOT AUTHORIZED!"),
            @ApiResponse(code = 403, message = "FORBIDDEN!"),
            @ApiResponse(code = 404, message = "NOT FOUND!")})

    @RequestMapping(value = "/customers")
    public List<Customer> getCustomers() throws IOException {
        return getAllCustomers();
    }

    @ApiOperation(value = "Get specific Customer in the System ", response = Purchase.class, tags = "customer")
    @RequestMapping(value = "/customer/{id}")
    public Customer getCustomer(@PathVariable(value = "id") String id) throws IOException {
        return getAllCustomers().stream().filter(x -> x.getId().equalsIgnoreCase(id)).collect(Collectors.toList()).get(0);
    }

    private List<Customer> getAllCustomers() throws IOException {
        GetAllCustomers getAllCustomers = new GetAllCustomers();
        List<Customer> customers = getAllCustomers.customerConverter(new com.momentum.api.Infrastructure.implementation.GetAllCustomers().getAllCustomers());
        return customers;
    }
}
