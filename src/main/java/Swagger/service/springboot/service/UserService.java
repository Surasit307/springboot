package Swagger.service.springboot.service;

import java.util.List;

import Swagger.service.springboot.entity.User;

public interface UserService {
	 public List<User> retrieveUser();
	  
	 public User getUser(Long sid);
	  
	 public void saveUser(User user);
	  
	 public void deleteUser(Long sid);
	  
	 public void updateUser(User user);
}