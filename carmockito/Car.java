package com.fdmgroup.carmockito;

public class Car {

	private Wheel wheel;
	public void drive() {
		wheel.spin();
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public void accelerate(int amount, String driver) {
		wheel.spin();
		wheel.spin(amount);
		wheel.spin(driver);
		wheel.spin(amount,driver);
	}

}
