package com.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
 
	private static List<User> users = new ArrayList<>();
	private static int userCount = 1;
	
	static
	{
		users.add(new User(userCount++,"Adam", LocalDate.now().minusYears(30)));
		users.add(new User(userCount++,"Eve", LocalDate.now().minusYears(25)));
		users.add(new User(userCount++,"Jim", LocalDate.now().minusYears(20)));
		
	}
	
	public List<User> findAll()
	{
		return users;
	}
	
	//to find a single user
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().get();
	}
	
	
	public User save(User user) {
		user.setId(userCount++);
		users.add(user);
		return user;
	}
	 
}
