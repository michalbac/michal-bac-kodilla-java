package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class ProductOrderService {


    public boolean order(User user, Product product, LocalDate orderDate) {

        System.out.println("Creating order for user: " + user.getUserName() + "\nOrdered product is: " + product.getProductName() + "\nOrder value is: " + product.getProductPrice());

        return true;
    }




}
