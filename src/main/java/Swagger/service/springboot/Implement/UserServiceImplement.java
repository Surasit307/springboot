package Swagger.service.springboot.Implement;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Swagger.service.springboot.entity.User;
import Swagger.service.springboot.repository.UserRepository;
import Swagger.service.springboot.service.UserService;
@Service
public class UserServiceImplement {
	@Autowired
	 private UserRepository userRepository;
	 
	 public void setEmployeeRepository(UserRepository userRepository) {
	  this.userRepository = userRepository;
	 }
	  
	 public List<User> retrieveEmployees() {
	  List<User> users = userRepository.findAll();
	  return users;
	 }
	  
	 public User getUser(Long sid) {
	  Optional<User> optUsd = userRepository.findById(sid);
	  return optUsd.get();
	 }
	  
	 public void saveUser(User user){
	  userRepository.save(user);
	 }
	  
	 public void deleteUser(Long employeeId){
	  userRepository.deleteById(employeeId);
	 }
	  
	 public void updateUser(User user) {
	  userRepository.save(user);
	
}
}
