package com.kodilla.good.patterns.Food2Door;

public class Customer {

    private String customerName;
    private String cutomerAdress;
    private String customerEmail;

    public Customer(String customerName, String cutomerAdress, String customerEmail) {
        this.customerName = customerName;
        this.cutomerAdress = cutomerAdress;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCutomerAdress() {
        return cutomerAdress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
