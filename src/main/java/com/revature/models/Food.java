package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="food_table")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {

    @Id
    @Column(name="food_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodID;

    @Column(name="food_name")
    private String foodName;

    @Column(name="type")
    private String mealType;

    @Column(name="recipe")
    private String recipe;

    @Column(name="img_url")
    private String img_url;

}
