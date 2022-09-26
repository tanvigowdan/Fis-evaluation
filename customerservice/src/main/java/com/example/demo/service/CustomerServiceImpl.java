package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AdminLink;
import com.example.demo.entity.Customer;
import com.example.demo.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired 
	CustomerRepository repo;
	
	@Autowired
	FeignProxy proxy;
	
	@Override
	public Customer add(Customer cust) {
		// TODO Auto-generated method stub
		return repo.save(cust);
	}

	@Override
	public List<Customer> getAllCust() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer update(Customer cust) {
		// TODO Auto-generated method stub
		return repo.save(cust);
	}

	@Override
	public String delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Customer Detail Deleted";
	}
	@Override
	public List<AdminLink> findMovieByRating(int id) {
		// TODO Auto-generated method stub
		return proxy.searchMovieByRating(id);
	}

	@Override
	public List<AdminLink> findMovieByLeadActor(String name) {
		// TODO Auto-generated method stub
		return proxy.searchMovieByLeadActor(name);
	}


}
