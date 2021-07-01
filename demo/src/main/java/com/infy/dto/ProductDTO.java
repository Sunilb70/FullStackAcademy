package com.infy.dto;

public class ProductDTO {
	long productCode;
	String productName;
	String productVendor;
	String productPrice;
	int productInStock;
	public long getProductCode() {
		return productCode;
	}
	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductVendor() {
		return productVendor;
	}
	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductInStock() {
		return productInStock;
	}
	public void setProductInStock(int productInStock) {
		this.productInStock = productInStock;
	}
	@Override
	public String toString() {
		return "ProductDTO [productCode=" + productCode + ", productName=" + productName + ", productVendor="
				+ productVendor + ", productPrice=" + productPrice + ", productInStock=" + productInStock + "]";
	}
	
	
}
