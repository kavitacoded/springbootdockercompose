package com.nt.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Food;
import com.nt.repo.FoodRestaurantRepository;
import com.nt.service.IFoodRestauratntService;

@Service
public class FoodRestaurantServiceImpl implements IFoodRestauratntService {

	@Autowired
	private FoodRestaurantRepository foodRepo;

	@Override
	public String registerFood(Food food) {
		return foodRepo.save(food) + "Item is Saved";
	}

	@Override
	public List<Food> showAllFoodsItems() {
		return foodRepo.findAll();
	}

}
