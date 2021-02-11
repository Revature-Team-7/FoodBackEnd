package com.revature.controller;

import com.revature.models.Restaurant;
import com.revature.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins= {"http://localhost:3000"})
@RestController
@RequestMapping(path="/goOut")
public class RestaurantController {

    private RestaurantRepo restaurantRepo;

    @Autowired
    public RestaurantController (RestaurantRepo restaurantRepo){this.restaurantRepo=restaurantRepo;}

    @GetMapping(path="/{type}")
    public ResponseEntity<Restaurant> getMealSuggestion(@PathVariable(name="type") String type){
        Restaurant suggestedRestaurant=restaurantRepo.findByMealType(type);
        return new ResponseEntity<>(suggestedRestaurant, HttpStatus.OK);
    }
}
