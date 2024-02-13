package com.machadodev.APIl.entities;

public class Products {

	private Long id;
	private String name;
	private Double price;
	private Departments department;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

	

	public Products(Long id, String name, Double price, Departments department) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.department = department;
	}

}
