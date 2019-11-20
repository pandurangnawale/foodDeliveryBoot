package com.yash.fooddelivery.service;

import java.util.List;

import com.yash.fooddelivery.model.User;

public interface FoodService {

	boolean userRegister(User use);

	List<User> getAllUser();

	List<User> getUserByName(String firstName);

	//String checkoutOrder(String foodName, String itemCode, int foodId, float prise, int qty);

}
