package com.infy.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infy.dto.ProductDTO;
import com.infy.exceptions.NoSuchProductException;
import com.infy.service.ProductService;

@RestController
@RequestMapping("/product")
public class AddProductsController {
	@Autowired 
	public ProductService productService;
	@GetMapping("/{productName}")
	public List<ProductDTO> getProducts(@PathVariable String productName){

		return  productService.getProducts();
		
	}
	@GetMapping
	public List<ProductDTO> getProducts(@RequestParam("productName") String productName,@RequestParam("productVendor") String productVendor){
		return productService.getProducts();
	}
	
	
	@PostMapping
	public ResponseEntity<String> addProduct(@RequestBody ProductDTO productDTO) {
		String res = productDTO.getProductName() + " Added Successfully ";
		return ResponseEntity.ok(res);
			
	}
	
}
