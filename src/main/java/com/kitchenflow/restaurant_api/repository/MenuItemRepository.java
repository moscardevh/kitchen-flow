package com.kitchenflow.restaurant_api.repository;

import com.kitchenflow.restaurant_api.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {
    
    List<MenuItem> findByTipo(String tipo);
    
    List<MenuItem> findByDisponivelTrue();
    
    List<MenuItem> findByCategory(String category);
}
