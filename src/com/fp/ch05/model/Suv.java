package com.fp.ch05.model;

public class Suv extends Car {
	public Suv(String name, String brand) {
		super(name, brand);
	}
	
	public void drive() {
		System.out.println("Driving an SUV " + name + " from " +brand);
	}
}
