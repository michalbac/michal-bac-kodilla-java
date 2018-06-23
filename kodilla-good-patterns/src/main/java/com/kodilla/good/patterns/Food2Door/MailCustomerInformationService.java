package com.kodilla.good.patterns.Food2Door;

public class MailCustomerInformationService implements CustomerInformationService {

    @Override
    public void inform(Customer customer) {
        System.out.println("\nSending email to: "+ customer.getCustomerEmail() + "\n Dear " + customer.getCustomerName() + "\nThank you for your order\n");
    }
}
