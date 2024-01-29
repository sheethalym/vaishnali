package com.cropdeal.user.controller;import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropdeal.user.entity.User;

import com.cropdeal.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping("/getallUser")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}

	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) throws Exception {
		return userService.updateUser(user);
	}

	@GetMapping("/mobile/{mobileNumber}")
	public User findByMobileNo(@PathVariable Long mobileNumber) throws Exception {
		return userService.findByMobileNo(mobileNumber);
	}

	@GetMapping("/UserName/{userName}")
	public User findByUserName(@PathVariable String userName) {
		return userService.findByUserName(userName);

	}

	@DeleteMapping("Delete/{userId}")
	public void deleteByUserId(@PathVariable int userId) throws Exception {
		userService.deleteUser(userId);
	}
}
