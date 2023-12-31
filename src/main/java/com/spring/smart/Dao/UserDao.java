package com.spring.smart.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.spring.smart.entity.User;

public interface UserDao extends JpaRepository<User, Long> {

	@Query("select u from User u where u.email= :email")
	  public User getUserByUserName(@Param("email") String email);
}
