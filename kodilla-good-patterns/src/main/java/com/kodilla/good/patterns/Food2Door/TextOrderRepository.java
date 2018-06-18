package com.kodilla.good.patterns.Food2Door;


public class TextOrderRepository implements OrderRepository {

    @Override
    public void addToRepository(OrderRequest orderRequest) {
        System.out.println("\nOrder added to the text repository\n");
    }
}
