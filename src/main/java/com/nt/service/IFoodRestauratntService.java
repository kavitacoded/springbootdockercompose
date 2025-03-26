package com.nt.service;

import java.util.List;

import com.nt.entity.Food;

public interface IFoodRestauratntService {

	public String registerFood(Food food);
	public List<Food> showAllFoodsItems();
}
