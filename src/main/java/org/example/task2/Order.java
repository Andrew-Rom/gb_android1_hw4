package org.example.task2;

public class Order {
    Customer customer;
    Product product;
    int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
}
