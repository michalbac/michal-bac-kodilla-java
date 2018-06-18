package com.kodilla.good.patterns.Food2Door;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

        OrderRequest orderRequestEFS = orderRequestRetriever.retrieveEFS();
        OrderProcessor orderProcessor = new OrderProcessor( new MailInformationService(), new OrderService(), new TextOrderRepository());
        orderProcessor.process(orderRequestEFS);
        System.out.println("---------------End of order------------\n");

        OrderRequest orderRequestGFS = orderRequestRetriever.retrieveGFS();
        OrderProcessor orderProcessor1 = new OrderProcessor( new MailInformationService(), new OrderService(), new TextOrderRepository());
        orderProcessor1.process(orderRequestGFS);
        System.out.println("---------------End of order------------\n");

        OrderRequest orderRequestHS = orderRequestRetriever.retrieveHS();
        OrderProcessor orderProcessor2 = new OrderProcessor( new MailInformationService(), new OrderService(), new TextOrderRepository());
        orderProcessor2.process(orderRequestHS);
        System.out.println("---------------End of order------------\n");



    }
}
