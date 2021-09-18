package com.practice.customerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.customerapp.entities.CustomerEntity;
import com.practice.customerapp.service.CustomerAppService;

@RestController
@CrossOrigin(origins="*")
public class CustomerAppController {

	@Autowired
	private CustomerAppService customerAppService;

	@GetMapping("/getCustomerDetails")
	public List<CustomerEntity> getCustomerDetails() {
		List<CustomerEntity> response = null;
		try {
			response = customerAppService.getCutomerDetails();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return response;
	}

	@GetMapping("/getCustomerDetailsByName")
	public CustomerEntity getCustomerDetailsByName(@RequestParam("firstName") String firstName) {
		CustomerEntity response = null;
		try {
			response = customerAppService.getCutomerDetailsByName(firstName);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return response;
	}

	@PostMapping("/createCustomerInfo")
	public CustomerEntity createCustomerInfo(@RequestBody CustomerEntity customerData) {
		CustomerEntity response = null;
		try {
			response = customerAppService.createCustomerInfo(customerData);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return response;
	}

	@DeleteMapping("/deleteCustomerInfo")
	public String deleteCustomerInfo(@RequestParam("id") long id) {
		customerAppService.deleteCustomerInfo(id);
		return "Succesfully deleted";
	}


}
