package com.practice.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.customerapp.Repository.CustomerAppRepo;
import com.practice.customerapp.entities.CustomerEntity;

@Service
public class CustomerAppService {

	@Autowired
	private CustomerAppRepo customerAppRepo;

	public List<CustomerEntity> getCutomerDetails() {
		return customerAppRepo.findAll();
	}

	public CustomerEntity getCutomerDetailsByName(String firstName) {
		return customerAppRepo.findByFirstName(firstName);
	}

	public CustomerEntity createCustomerInfo(CustomerEntity customerData) {
		return customerAppRepo.save(customerData);
	}

	public void deleteCustomerInfo(long id) {
		customerAppRepo.deleteById(id);
	}
}
