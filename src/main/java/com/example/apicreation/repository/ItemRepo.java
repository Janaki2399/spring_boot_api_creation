package com.example.apicreation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.apicreation.model.Item;

public interface ItemRepo extends JpaRepository<Item,Integer>{

}
