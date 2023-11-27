package com.groceryapi.groceryproject.modules;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AdminController {
     @Autowired
    private AdminService adminService;

    @PostMapping("/addGroceryItem")
    public GroceryItem addGroceryItem(@RequestBody GroceryItem groceryItem){
        return adminService.addGroceryItem(groceryItem);
    }

    @GetMapping("/viewGroceryItem")
    public List<GroceryItem> viewGroceryItem(){
        return adminService.viewGroceryItem();
    }

    @DeleteMapping("/removeGroceryItem")
    public void removeGroceryItem(@PathVariable Long itemId){
        adminService.removeGroceryItem(itemId);
    }

    @PostMapping("/manageInventory/{itemId}/{quantity}")
    public void manageInventory(@PathVariable Long itemId, @PathVariable int quantity) {
        adminService.manageInventory(itemId, quantity);
    }

}
