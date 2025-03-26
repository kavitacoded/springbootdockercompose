package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nt.entity.Food;

public interface FoodRestaurantRepository extends JpaRepository<Food, Integer> {

}
