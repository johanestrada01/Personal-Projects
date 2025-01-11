package com.manager.manager.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    private String id;
    private String brand;
    private String product_line;
    private String product_name;
    private String product_size;
    private int base_price;
    private int tax;
    private int revenue;
    private int stock;
    private int branch;

    public Product(){}

    public Product(String id, String brand, String product_line, String product_name, String product_size, int base_price, int tax, int revenue, int stock){
        this.id = id;
        this.brand = brand;
        this.product_line = product_line;
        this.product_name = product_name;
        this.product_size = product_size;
        this.base_price = base_price;
        this.tax = tax;
        this.revenue = revenue;
        this.stock = stock;
    }

    
}
