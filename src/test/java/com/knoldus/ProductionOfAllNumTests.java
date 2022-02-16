package com.knoldus;

import org.junit.Assert;
import org.junit.Test;

public class ProductionOfAllNumTests {

    @Test
    public void shouldGetProduced() {


        long expected = 24;
        long output = ProductionOfAllNum.getResult(1, 4);
        Assert.assertTrue(expected == output);
    }
}
