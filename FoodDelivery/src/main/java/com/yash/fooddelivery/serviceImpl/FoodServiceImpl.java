package com.yash.fooddelivery.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.fooddelivery.dao.FoodDao;
import com.yash.fooddelivery.model.User;
import com.yash.fooddelivery.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{
	
	@Autowired 
	FoodDao foodDao;

	@Override
	public boolean userRegister(User user) {
		foodDao.save(user);
		return true;
	}

	@Override
	public List<User> getAllUser() {		
		return foodDao.findAll();
	}

	@Override
	public List<User> getUserByName(String firstName) {
		return foodDao.findByName(firstName);
	}

	/*@Override
	public String checkoutOrder(String foodName, String itemCode, int foodId, float prise, int qty) {
		//String response = foodDao.saveAll(foodName,itemCode,foodId,prise,qty);
	}*/
}
