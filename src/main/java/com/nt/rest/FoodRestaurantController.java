package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Food;
import com.nt.service.IFoodRestauratntService;

@RestController
public class FoodRestaurantController {

	@Autowired
	private IFoodRestauratntService service;
	
	@PostMapping("/save")
	public ResponseEntity<?> registerRestaurantFoods(@RequestBody Food food){
		String msg=service.registerFood(food);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<Food>> showAllFoodItems(){
		List<Food> food=service.showAllFoodsItems();
		return new ResponseEntity<List<Food>>(food,HttpStatus.OK);
	}
	
	
	
	
}//class
