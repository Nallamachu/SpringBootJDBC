package com.springboot.BootApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.BootApplication.dao.CustomerDao;
import com.springboot.BootApplication.pojo.Customer;

@RestController
public class MainController {
	@Autowired
	public CustomerDao customerdao;

	@GetMapping("/getcustinfo")
	public List<Customer> customerInfo() {
		List<Customer> customer = customerdao.isData();
		return customer;
	}

}
