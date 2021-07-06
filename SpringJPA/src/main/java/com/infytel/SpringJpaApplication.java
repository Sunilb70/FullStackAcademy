//package com.infytel;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringJpaApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJpaApplication.class, args);
//		
//		System.out.println("Starting JPA");
//	}
//
//}
package com.infytel;
import java.util.Scanner;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import com.infytel.dto.CustomerDTO;
import com.infytel.service.CustomerService;
@SpringBootApplication
public class SpringJpaApplication  {
    static Logger logger = Logger.getLogger(SpringJpaApplication.class);
	@Autowired
	AbstractApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}
	
}

