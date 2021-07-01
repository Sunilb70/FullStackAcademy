package com.infy.repository;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.infy.dto.ProductDTO;
@Repository
public class ProductRepository {
	public List<ProductDTO> products = null;
	@PostConstruct
	public void initializer() {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProductCode(8553885703l);
		productDTO.setProductName("Good Day");
		productDTO.setProductPrice("50");
		productDTO.setProductVendor("cadburys");
		productDTO.setProductInStock(500);
		products = new ArrayList<>();
		products.add(productDTO);
		
	}
	

	public List<ProductDTO> getProducts() {
		// TODO Auto-generated method stub
		 
		return products;
	}

	
}
