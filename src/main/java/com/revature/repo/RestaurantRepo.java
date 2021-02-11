package com.revature.repo;

import com.revature.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {
    Restaurant findByMealType(String mealType);
    //possibily search by cost in future.
}
