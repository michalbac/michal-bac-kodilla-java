package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private MailInformationService mailInformationService;
    private ProductOrderService productOrderService;
    private TextOrderRepository textOrderRepository;

    public OrderProcessor(final MailInformationService mailInformationService,
                               final ProductOrderService productOrderService,
                               final TextOrderRepository textOrderRepository) {
        this.mailInformationService = mailInformationService;
        this.productOrderService = productOrderService;
        this.textOrderRepository = textOrderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getOrderDate());

        if(isOrdered) {
            mailInformationService.inform(orderRequest.getUser());
            textOrderRepository.addToRepository(orderRequest);
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
