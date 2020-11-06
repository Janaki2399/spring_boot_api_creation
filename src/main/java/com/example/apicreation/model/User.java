package com.example.apicreation.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {
    @Id
	private int userId;
	private String name;
	private String email;
	
	@OneToMany(targetEntity = Orders.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="user_id",referencedColumnName = "userId")
    private List<Orders> products;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Orders> getProducts() {
		return products;
	}
	public void setProducts(List<Orders> products) {
		this.products = products;
	}	
}
