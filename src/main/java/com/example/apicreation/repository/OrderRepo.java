package com.example.apicreation.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.apicreation.model.Orders;

public interface OrderRepo extends JpaRepository<Orders,Integer>{
	
}
