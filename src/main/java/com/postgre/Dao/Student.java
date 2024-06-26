package com.postgre.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Student {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	//creating table...
	public void createTable() {
		var query="CREATE TABLE student(id SERIAL PRIMARY KEY,name varchar(255) NOT NULL,city varchar(255))";
		int update = this.jdbcTemplate.update(query);
		System.out.println(update);
	}
	
	//inserting data
	public void insertData(String name,String city) {
		
		String q="insert into student(name,city) values(?,?)";
		int update = this.jdbcTemplate.update(q,name,city);
		System.out.println(update+"rows added");
		
		
		
	}

}
