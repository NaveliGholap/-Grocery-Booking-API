package com.groceryapi.groceryproject.modules;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private double price;
    private int stockquantity;
    
    public GroceryItem(Long iD, String name, double price, int stockquantity) {
        ID = iD;
        this.name = name;
        this.price = price;
        this.stockquantity = stockquantity;
    }

    
    public Long getID() {
        return ID;
    }
    public void setID(Long iD) {
        ID = iD;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStockquantity() {
        return stockquantity;
    }
    public void setStockquantity(int stockquantity) {
        this.stockquantity = stockquantity;
    }

}
