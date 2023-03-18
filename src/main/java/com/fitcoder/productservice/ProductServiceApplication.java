package com.fitcoder.productservice;

import com.fitcoder.productservice.connection.IPRepoImpl;
import com.fitcoder.productservice.connection.IPRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductServiceApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductServiceApplication.class, args);
		IPRepoImpl ipRepo = context.getBean(IPRepoImpl.class);
		ipRepo.exampleMethod();
	}
}

