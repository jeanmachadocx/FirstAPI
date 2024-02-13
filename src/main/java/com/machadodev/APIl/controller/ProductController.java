package com.machadodev.APIl.controller;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.machadodev.APIl.entities.Departments;
import com.machadodev.APIl.entities.Products;

@RestController
@RequestMapping("/products") // endpoint
public class ProductController {

	@GetMapping
	public List<Products>getObjects() {
		Departments d1 = new Departments(1L, "Tech");
		Departments d2 = new Departments(2L, "Pet");
		
		Products p1 = new Products(1L, "Macbook Pro", 4000.0, d1);
		Products p2 = new Products(2L, "PC Gamer", 5000.0, d1);
		Products p3 = new Products(3L, "Pet House", 300.0, d2);
		
		
		return Arrays.asList(p1,p2,p3);
		
	}
}
