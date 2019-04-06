package com.webdev.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdev.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByName(String name);
}
