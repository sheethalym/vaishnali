package com.cropdeal.user.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cropdeal.user.entity.User;
import com.cropdeal.user.exception.UserNotFoundException;
import com.cropdeal.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User addUser(User user) {
		User users = userRepository.save(user);
		return users;
	}

	@Override
	public List<User> getAllUser() {

		return userRepository.findAll();
	}

	@Override
	public User getByuserId(int userId) throws Exception {

		return userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User with given id is not found :" + userId));
	}

	@Override
	public User updateUser(User user) throws Exception {
		User user1 = userRepository.findById(user.getUserId()).orElseThrow(
				() -> new UserNotFoundException("User with given id is not found :" + user.getUserId()));
		user1.setUserId(user.getUserId());
		user1.setUserName(user.getUserName());
		user1.setEmailId(user.getEmailId());
		user1.setMobileNumber(user.getMobileNumber());
		user1.setDateOfBirth(user.getDateOfBirth());
		user1.setRole(user.getRole());
		user1.setPassword(user.getPassword());
		return userRepository.save(user1);

	}

	@Override
	public void deleteUser(int userId) throws Exception {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new UserNotFoundException("User with given id is not found :" + userId));
		userRepository.delete(user);

	}

	@Override
	public User findByMobileNo(Long mobileNumber) {
		User user = userRepository.findAllByMobileNumber(mobileNumber);
		return user;

	}

	@Override
	public User findByUserName(String userName) {
		User user = userRepository.findByUserName(userName);

		return user;

	}
}
