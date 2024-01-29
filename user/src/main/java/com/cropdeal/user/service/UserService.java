package com.cropdeal.user.service;

import java.util.List;

import com.cropdeal.user.entity.User;


public interface UserService {
	public User addUser(User user);

	public List<User> getAllUser();

	public User getByuserId(int userId) throws Exception ;

	public User updateUser(User user) throws Exception;

	public void deleteUser(int userId) throws Exception;

	public User findByMobileNo(Long mobileNumber);

	public User findByUserName(String Name);
}