package com.kitchenflow.restaurant_api.service;

import com.kitchenflow.restaurant_api.model.MenuItem;
import com.kitchenflow.restaurant_api.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    public List<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    public Optional<MenuItem> getMenuItemById(Long id) {
        return menuItemRepository.findById(id);
    }

    public List<MenuItem> getMenuItemsByTipo(String tipo) {
        return menuItemRepository.findByTipo(tipo);
    }

    public List<MenuItem> getAvailableMenuItems() {
        return menuItemRepository.findByDisponivelTrue();
    }

    public MenuItem saveMenuItem(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    public void deleteMenuItem(Long id) {
        menuItemRepository.deleteById(id);
    }
}
