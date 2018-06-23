package com.kodilla.good.patterns.Food2Door;

public class OrderProcessor {

    private CustomerInformationService customerInformationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(CustomerInformationService customerInformationService, OrderService orderService, OrderRepository orderRepository) {
        this.customerInformationService = customerInformationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getCustomer(),orderRequest.getProduct(),orderRequest.getProducer(), orderRequest.getOrderDate());

        if(isOrdered) {
            customerInformationService.inform(orderRequest.getCustomer());
            orderRepository.addToRepository(orderRequest);
            orderRequest.getProducer().process(orderRequest.getProduct());
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), orderRequest.getProduct(), false);
        }
    }
}
