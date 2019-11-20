package com.yash.fooddelivery.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.yash.fooddelivery.dao.FoodDao;
import com.yash.fooddelivery.model.Login;
import com.yash.fooddelivery.model.Order;
import com.yash.fooddelivery.model.User;
import com.yash.fooddelivery.service.FoodService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*" )
public class FoodController {	
		
	@Autowired
	FoodService service;
	
	@Autowired 
	FoodDao foodDao;
	
	@PostMapping("/user/UserRegisteration")
	public User userRegister(@RequestBody User user) {
		service.userRegister(user);
		return user;
	}
	
	@GetMapping("user/GetAllUser")
	public List<User> getAllUser() {
		List<User> allUser= new ArrayList<>();
		allUser=service.getAllUser();
		return allUser;
	}
	
	@GetMapping("/user/{username}")
	public List<User> getUserByName(@PathVariable String username){
		return service.getUserByName(username);
	}
	
	 @PostMapping(value = "/auth/login")
     public User loginUser(@RequestBody Login login) {
		 System.out.println(login.getUsername() + "  "+ login.getPassword());
		 User userData = null;
		 try {
			 userData = foodDao.FindByLogin(login.getUsername(), login.getPassword());
			 System.out.println(userData);
		 }catch(Exception ex) {
			 System.out.println(ex);
			 
		 }		 
		 return userData;
     }
	 
	/* @PostMapping(value="/order/checkout")
	 public String checkout(@RequestBody Order order){
		try {
			String response = service.checkoutOrder(order.getFoodName(),order.getItemCode(),order.getFoodId(),order.getPrise(),order.getQty());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		 return null;
		 
	 }*/

}
