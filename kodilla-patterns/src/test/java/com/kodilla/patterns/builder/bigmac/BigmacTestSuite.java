package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void TestBigMacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("Bun with sesame")
                .burgers(2)
                .ingredient("onion")
                .ingredient("bacon")
                .sauce("BBQ")
                .ingredient("chili")
                .build();
        System.out.println(bigmac);

        //When
        int ingredientsQuantity = bigmac.getIngredeitns().size();
        String bun = bigmac.getBun();
        String sauce = bigmac.getSauce();

        //Then
        Assert.assertEquals(3,ingredientsQuantity);
        Assert.assertEquals("Bun with sesame", bun);
        Assert.assertEquals("BBQ", sauce);
    }
}
