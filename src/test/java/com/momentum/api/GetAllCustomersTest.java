package com.momentum.api;

import com.momentum.api.implementation.GetAllCustomers;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetAllCustomersTest {

    @Test
    public void TestGetAllCustomers() throws IOException {
        Assert.assertEquals(true, new GetAllCustomers().getAllCustomers().size() > 0);
    }
}
