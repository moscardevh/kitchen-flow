package com.kitchenflow.restaurant_api.controller;

import com.kitchenflow.restaurant_api.model.MenuItem;
import com.kitchenflow.restaurant_api.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MenuController {

    @Autowired
    private MenuItemService menuItemService;

    @GetMapping("/hello")
    public String hello() {
        return "Kitchen Flow API is working! 🍕";
    }
    
    @GetMapping("/menu")
    public List<MenuItem> getAllMenuItems() {
        return menuItemService.getAllMenuItems();
    }
    
    @GetMapping("/menu/{id}")
    public MenuItem getMenuItemById(@PathVariable Long id) {
        return menuItemService.getMenuItemById(id)
                .orElseThrow(() -> new RuntimeException("MenuItem not found with id: " + id));
    }
    
    @GetMapping("/menu/tipo/{tipo}")
    public List<MenuItem> getMenuItemsByTipo(@PathVariable String tipo) {
        return menuItemService.getMenuItemsByTipo(tipo);
    }
    
    @GetMapping("/menu/available")
    public List<MenuItem> getAvailableMenuItems() {
        return menuItemService.getAvailableMenuItems();
    }
    
    @PostMapping("/menu")
    public MenuItem createMenuItem(@RequestBody MenuItem menuItem) {
        return menuItemService.saveMenuItem(menuItem);
    }
    
    @DeleteMapping("/menu/{id}")
    public void deleteMenuItem(@PathVariable Long id) {
        menuItemService.deleteMenuItem(id);
    }
}
