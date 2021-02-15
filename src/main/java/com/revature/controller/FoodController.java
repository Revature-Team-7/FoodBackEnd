package com.revature.controller;

import com.revature.models.Food;
import com.revature.repo.FoodRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(path="/home")
public class FoodController {

    private FoodRepo foodRepo;

    @Autowired
    public FoodController (FoodRepo foodRepo){this.foodRepo=foodRepo;}

    @GetMapping(path="/{type}")
    public List<Food> getMealSuggestion(@PathVariable(name="type") String type){
    	List<Food> suggestedFood=foodRepo.findByMealType(type);
        System.out.println(suggestedFood);
        return suggestedFood;
    }
}
