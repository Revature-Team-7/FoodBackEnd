package com.revature.repo;

import com.revature.models.Restaurant;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {
	
	
    List<Restaurant> findByMealType(String mealType);
    //possibily search by cost in future.
}
