package com.yash.fooddelivery.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.yash.fooddelivery.model.User;

@Repository
public interface FoodDao extends JpaRepository<User, Integer>{	
	@Query("FROM User WHERE first_name =:firstname")
	List<User> findByName(@Param(value ="firstname") String firstname); //Use Pojo Name Dont Use Table Name	

		
	@Query("FROM User WHERE user_id =:username and password=:password")
	User FindByLogin(@Param(value ="username") String username,@Param (value="password") String password);
	
}
