package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.AdminLink;
import com.example.demo.entity.Customer;

public interface CustomerService {

	public Customer add(Customer cust);
	public List<Customer> getAllCust();
	public Customer update(Customer cust);
	public String delete(int id);
	public List<AdminLink> findMovieByRating(int id);
	public List<AdminLink> findMovieByLeadActor(String name);
}