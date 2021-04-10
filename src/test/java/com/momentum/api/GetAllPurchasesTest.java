package com.momentum.api;

import com.momentum.api.implementation.GetAllPurchases;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetAllPurchasesTest {
    @Test
    public void TestGetAllPurchases() throws IOException {
        Assert.assertEquals(true, new GetAllPurchases().getAllPurchases().size() > 0);
    }
}
