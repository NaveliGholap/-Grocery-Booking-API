package com.groceryapi.groceryproject.modules;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    
    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public GroceryItem addGroceryItem(GroceryItem groceryItem){
        return groceryItemRepository.save(groceryItem);
    }

    public List<GroceryItem> viewGroceryItem(){
        return groceryItemRepository.findAll();
    }

    public void removeGroceryItem(Long itemId){
        groceryItemRepository.deleteById(itemId);
    }

    public GroceryItem updateGroceryItem(Long itemId, GroceryItem updatedItem) {
        GroceryItem existingItem = groceryItemRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Grocery item not found"));

                existingItem.setName(updatedItem.getName());
                existingItem.setPrice(updatedItem.getPrice());
                return groceryItemRepository.save(existingItem);
    }

    public void manageInventory(Long itemId, int quantity) {
        GroceryItem item = groceryItemRepository.findById(itemId)
                .orElseThrow(() -> new RuntimeException("Grocery item not found"));

        item.setStockquantity(item.getStockquantity() + quantity);
        groceryItemRepository.save(item);
    }
}
