package com.revature.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="restaurant_table")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {

    @Id
    @Column(name="restaurant_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurantID;

    @Column(name="restaurant_name")
    private String restaurantName;

    @Column(name="type")
    private String mealType;

    @Column(name="img_url")
    private String imgUrl;
}
