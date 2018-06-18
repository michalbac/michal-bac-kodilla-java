package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieveEFS() {

        Customer customer = new Customer("John Customer", "Warsaw, Jerozolimskie 15", "johncustomer@gmail.com");
        Product product = new Product("Milk", 8.00, 1.2);

        return new OrderRequest(customer, product, new ExtraFoodShop("ExtraFoodShop"), LocalDate.now());
    }

    public OrderRequest retrieveGFS() {
        Customer customer = new Customer("Ann Client", "Warsaw, Marszalkowska 1", "anncliet@gmail.com");
        Product product = new Product("Bread", 3.00, 0.5);

        return new OrderRequest(customer, product, new GlutenFreeShop("GlutenFreeShop"), LocalDate.now());
    }

    public OrderRequest retrieveHS() {
        Customer customer = new Customer("Tom Buyer", "London, King str 5", "tombuyer@gmail.com");
        Product product = new Product("Protein shake", 15.00, 0.8);

        return new OrderRequest(customer, product, new HealthyShop("HealthyShop"), LocalDate.now());

    }

}
