package com.example.apicreation.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apicreation.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {
	
	
}
