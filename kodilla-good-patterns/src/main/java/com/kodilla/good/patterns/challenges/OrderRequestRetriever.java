package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("User1", 'M', "user1@gmail.com");
        Product product = new Product("Game", 100, true);

        int orderNumber = 123410;
        LocalDate orderDate = LocalDate.of(2018,6,10);

        return new OrderRequest(user,product, orderNumber, orderDate);
    }
}
