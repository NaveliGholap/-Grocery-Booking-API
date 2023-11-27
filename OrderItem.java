package com.groceryapi.groceryproject.modules;

public class OrderItem {
    private Long groceryItemID;
    private int quantity;
    
    public Long getGroceryItemID() {
        return groceryItemID;
    }
    public void setGroceryItemID(Long groceryItemID) {
        this.groceryItemID = groceryItemID;
    }
    public int getQuantity() {
        return quantity;
    }
    public OrderItem(Long groceryItemID, int quantity) {
        this.groceryItemID = groceryItemID;
        this.quantity = quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
