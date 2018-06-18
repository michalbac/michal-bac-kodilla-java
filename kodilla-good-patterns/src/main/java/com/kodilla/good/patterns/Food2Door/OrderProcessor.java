package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getProducer(), orderRequest.getOrderDate());

        if(isOrdered) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.addToRepository(orderRequest);
            orderRequest.getProducer().process(orderRequest.getProduct());
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(), false);
        }
    }
}
