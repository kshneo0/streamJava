package com.fp.ch05.model;

public class Van extends Car {
	public Van(String name, String brand) {
		super(name, brand);
	}
	
	public void drive() {
		System.out.println("Driving a van " + name + " from " +brand);
	}
}
