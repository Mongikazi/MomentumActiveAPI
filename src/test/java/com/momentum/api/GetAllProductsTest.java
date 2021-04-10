package com.momentum.api;

import com.momentum.api.implementation.GetAllProducts;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetAllProductsTest {
    @Test
    public void TestGetAllProducts() throws IOException {

        Assert.assertEquals(true, new GetAllProducts().getAllProducts().size() > 0);
    }
}
