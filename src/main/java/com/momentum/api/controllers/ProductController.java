package com.momentum.api.controllers;

import com.momentum.api.implementation.GetAllProducts;
import com.momentum.api.models.Product;
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

@Api(value = "ProductController", description = "Product Controller REST API Methods")
@RestController
public class ProductController {

    List<Product> products = new ArrayList<>();

    @ApiOperation(value = "Get list of Products in the System ", response = Iterable.class, tags = "products")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "SUCCESS!"),
            @ApiResponse(code = 401, message = "NOT AUTHORIZED!"),
            @ApiResponse(code = 403, message = "FORBIDDEN!"),
            @ApiResponse(code = 404, message = "NOT FOUND!")})

    @RequestMapping(value = "/products")
    public List<Product> getProducts() throws IOException {
        return getAllProducts();
    }

    @ApiOperation(value = "Get specific Product in the System ", response = Purchase.class, tags = "product")
    @RequestMapping(value = "/product/{id}")
    public Product getProduct(@PathVariable(value = "id") String id) throws IOException {
        return getProducts().stream().filter(x -> x.getId().equalsIgnoreCase(id)).collect(Collectors.toList()).get(0);
    }

    private List<Product> getAllProducts() throws IOException {
        GetAllProducts getAllProducts = new GetAllProducts();
        List<Product> products = getAllProducts.productsConverter(new com.momentum.api.Infrastructure.implementation.GetAllProducts().getAllProducts());
        return products;
    }
}
