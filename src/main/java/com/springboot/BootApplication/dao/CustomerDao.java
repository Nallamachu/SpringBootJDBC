package com.springboot.BootApplication.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.BootApplication.pojo.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String sql = "select * from customer_temp";

	public List<Customer> isData() {
		List<Customer> list = new ArrayList<>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : rows) {
			Customer customer = new Customer();
			customer.setId((int) row.get("id"));
			customer.setName((String) row.get("name"));
			customer.setLocation((String) row.get("location"));
			list.add(customer);
		}
		return list;
	}

}
