package com.cropdeal.user.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cropdeal.user.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User,Integer>{
	@Query("{'mobileNumber':?0}")
	User findAllByMobileNumber(Long mobileNumber);
	
	@Query("{'userName':?0}")
	User findByUserName(String userName);

}
	


