package com.example.SpringRedisDemo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;
import java.util.Objects;

@RedisHash("Product")
public class Product implements Serializable {

    @Id
    private int id;
    private String name;
    private int qty;
    private long price;

    @JsonIgnore
    private transient Product relatedProduct;

    // Default constructor
    public Product() {}

    // Parameterized constructor
    public Product(int id, String name, int qty, long price) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public long getPrice() {
        return price;
    }

    public Product getRelatedProduct() {
        return relatedProduct;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setRelatedProduct(Product relatedProduct) {
        this.relatedProduct = relatedProduct;
    }

    // toString method
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    // equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && qty == product.qty && price == product.price &&
                Objects.equals(name, product.name);
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, qty, price);
    }
}
