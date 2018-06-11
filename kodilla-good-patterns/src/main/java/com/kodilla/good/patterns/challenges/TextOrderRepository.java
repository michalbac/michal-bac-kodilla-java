package com.kodilla.good.patterns.challenges;

public class TextOrderRepository implements OrderRepository {

    @Override
    public void addToRepository(OrderRequest orderRequest) {
        System.out.println("Order added to the text repository");
    }
}
