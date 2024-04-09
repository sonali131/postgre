package com.postgre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.postgre.Dao.Student;

@SpringBootApplication
public class PostgreApplication implements CommandLineRunner {
	
	@Autowired
	private Student student;

	public static void main(String[] args) {
		SpringApplication.run(PostgreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//this.student.createTable();
		this.student.insertData("Sonali", "Jaunpur");
		
	}

}
