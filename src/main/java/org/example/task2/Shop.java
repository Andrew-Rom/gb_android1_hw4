package org.example.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    public static void main() {
        Object[][] values = {
                {new Customer("Joe Black"), new Product("Beer"), 10},
                {new Customer("Jane Doe"), new Product("Water"), 1},
                {new Customer("Ivan Smirnoff"), new Product("Beer"), 1},
                {new Customer("Joe Black"), new Product("Vodka"), 10},
                {new Customer("Joe Black"), new Product("Beer"), 0},
        };

        for (Object[] value : values) {
            try {
                orders.add(makePurchase((Customer) value[0], (Product) value[1], (Integer) value[2]));
            } catch (WrongCustomerException | WrongProductException | WrongProductQuantityException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Unknown error");
            } finally {
                System.out.println("Created " + orders.size() + " orders.");
            }
        }
    }

    private static Customer[] customers = {
            new Customer("Joe Black"),
            new Customer("John Doe"),
            new Customer("Jane Doe")
    };

    private static Product[] products = {
            new Product("Beer"),
            new Product("Water"),
            new Product("Bread"),
            new Product("Meat"),
            new Product("Potatoes"),
            new Product("Fish")
    };

    public static ArrayList<Order> orders = new ArrayList<>();

    public static Order makePurchase(Customer customer, Product product, int quantity)
            throws WrongCustomerException, WrongProductException, WrongProductQuantityException {
        if (!Arrays.asList(customers).contains(customer)) {
            throw new WrongCustomerException();
        } else if (!Arrays.asList(products).contains(product)) {
            throw new WrongProductException();
        } else if (quantity <= 0) {
            throw new WrongProductQuantityException();
        } else {
            System.out.println("New order created (" + customer + " bought " + product + ").");
            return new Order(customer, product, quantity);
        }
    }
}
