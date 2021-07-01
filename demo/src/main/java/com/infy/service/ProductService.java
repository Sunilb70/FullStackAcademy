package com.infy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.ProductDTO;
import com.infy.repository.ProductRepository;
@Service
public class ProductService {
	@Autowired
	public  ProductRepository productRepository;
	
	public  List<ProductDTO> getProducts(){
		 
		return 	productRepository.getProducts();
	
	}

}
