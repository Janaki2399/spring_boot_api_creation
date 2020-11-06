package com.example.apicreation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.apicreation.repository.ItemRepo;
import com.example.apicreation.repository.OrderRepo;
import com.example.apicreation.repository.UserRepo;
import com.example.apicreation.helper.OrderRequest;
import com.example.apicreation.model.Item;
import com.example.apicreation.model.Orders;
import com.example.apicreation.model.User;

@RestController
public class Controller {

	@Autowired
	ItemRepo itemRepo;
	@Autowired
	UserRepo userRepo;
	@Autowired
	OrderRepo orderRepo;
	
	@PostMapping("/home/createItem")
	public Item createItem(@RequestBody Item item) {
		itemRepo.save(item);
		return item;
	}
	
	@GetMapping("/home/getItems")
	public List<Item> getAllItem(){
		return itemRepo.findAll();
	}
		
	@PostMapping("/home/placeOrder")
	public User placeOrder(@RequestBody OrderRequest order) {
		return userRepo.save(order.getUser());
	}
	
	@PutMapping("/home/updateStatus")
	public Orders updateStatus(@RequestBody Orders order) {
		orderRepo.save(order);
		return order;
	}
	
	@GetMapping("/home/salesInfo")
    public List<Orders> getSalesInfo(){
        return orderRepo.findAll();
    }
}
