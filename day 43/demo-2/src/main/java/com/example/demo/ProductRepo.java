package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface ProductRepo extends JpaRepository<Product, Integer>{
	
	
}
