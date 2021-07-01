package com.infy.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.ProductDTO;

@RestController
@RequestMapping("/greet")
public class CookPickController {

	@GetMapping
	public String greet() {
		Date date = new Date();
		String day = new SimpleDateFormat("EEEE").format(date);

		return "Welcome to " + day  + " sale";
	}
	
	
}
