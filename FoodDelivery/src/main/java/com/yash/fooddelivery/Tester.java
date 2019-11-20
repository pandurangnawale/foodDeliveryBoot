package com.yash.fooddelivery;

import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yash.fooddelivery.model.User;

public class Tester {
public static void main(String[] args) {
	try {
		ObjectMapper mapper = new ObjectMapper();
			User user = new User();
			//user.setBirthDate(new Date());
			user.setEmail("yeadpintya@gmail.com");
			user.setUserId("999");
			System.out.println(mapper.writeValueAsString(user));
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
