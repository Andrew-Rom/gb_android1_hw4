package org.example.task2;

import java.util.Objects;

public class Customer {
    String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerName.equals(customer.customerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName);
    }

    @Override
    public String toString() {
        return customerName;
    }
}
