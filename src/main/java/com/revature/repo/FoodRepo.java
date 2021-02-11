package com.revature.repo;

import com.revature.models.Food;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food, Integer> {
    List<Food> findByMealType(String mealType);
    
    List<Food> findAll();
}
