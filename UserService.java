package com.groceryapi.groceryproject.modules;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    public List<GroceryItem> viewAvailableGroceryItem(){
      return groceryItemRepository.findAll();  
    }
    
    public Order createOrder(List<OrderItem> orderItem){
       Order order=new Order(null, orderItem);
        order.setOrderItem(orderItem);
        return orderRepository.save(order);
    }
}
