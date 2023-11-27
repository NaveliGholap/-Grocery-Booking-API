package com.groceryapi.groceryproject.modules;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/viewAvailableGroceryItems")
    public List<GroceryItem> viewAvailableGroceryItems() {
        return userService.viewAvailableGroceryItem();
    }

    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody List<OrderItem> orderItems) {
        return userService.createOrder(orderItems);
    }
}
