package ru.ibs.appline.framework.data;

import java.util.Objects;

public class Product implements Comparable {

    private final String title;
    private final Integer price;

    public Product(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Product x = (Product) o;
        return this.getTitle().concat(this.getPrice().toString()).compareTo(x.getTitle().concat(x.getPrice().toString()));
    }
}
