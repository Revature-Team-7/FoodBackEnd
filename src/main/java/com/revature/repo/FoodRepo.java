package com.revature.repo;

import com.revature.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food, Integer> {
    Food findByMealType(String mealType);
}
