package org.example.task2;

import java.util.Objects;

public class Product {
    String productTitle;

    public Product(String productTitle) {
        this.productTitle = productTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productTitle.equals(product.productTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTitle);
    }

    @Override
    public String toString() {
        return productTitle;
    }
}
