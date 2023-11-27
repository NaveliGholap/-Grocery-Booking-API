package com.groceryapi.groceryproject.modules;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {

     @Id
    private Long id;
    private List<OrderItem> orderItem;
    
    public Order(Long id, List<OrderItem> orderItem) {
        this.id = id;
        this.orderItem = orderItem;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<OrderItem> getOrderItem() {
        return orderItem;
    }
    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }
   
    
}
