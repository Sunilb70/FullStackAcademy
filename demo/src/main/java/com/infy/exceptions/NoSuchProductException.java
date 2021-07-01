package com.infy.exceptions;

public class NoSuchProductException  extends Exception{
private static final long serialVersionUID = 1L;
	
	public NoSuchProductException() {
		super();
	}

	public NoSuchProductException(String errors) {
		super(errors);
		
	}
	
}
