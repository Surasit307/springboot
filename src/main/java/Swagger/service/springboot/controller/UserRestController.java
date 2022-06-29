package Swagger.service.springboot.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Swagger.service.springboot.entity.User;   
import Swagger.service.springboot.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	 private UserService userService;
	  
	 public void setUserService(UserService userService) {
	  this.userService = userService;
	 }
	 
	 @GetMapping("/api/users")
	 public List<User> getUser() {
	  List<User> users = userService.retrieveUser();
	  return users;
	 }
	  
	 @GetMapping("/api/users/{sid}")
	 public User getUser(@PathVariable(name="sid")Long sid) {
	  return userService.getUser(sid);
	 }
	  
	 @PostMapping("/api/users")
	 public void saveUser(User user){
	  userService.saveUser(user);
	  System.out.println("User Saved Successfully");
	 }
	  
	 @DeleteMapping("/api/users/{sid}")
	 public void deleteUser(@PathVariable(name="sid")Long sid){
	  userService.deleteUser(sid);
	  System.out.println("User Deleted Successfully");
	 }
	  
	 @PutMapping("/api/users/{sid}")
	 public void updateUser(@RequestBody User user,
	   @PathVariable(name="sid")Long sid){
	  User usr = userService.getUser(sid);
	  if(usr != null){
	   userService.updateUser(user);
	  }
	  
	 }

}
