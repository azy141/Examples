package com.fdmgroup.firstproject;

public class Calculator {

	public int square(int value) {
		int result = value * value;
		return result;
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.square(3);
		System.out.println(result);
	
	}

}
