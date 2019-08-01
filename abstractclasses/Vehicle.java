package com.fdmgroup.abstractclasses;

public abstract class Vehicle {
	
	private int engineSize;
	
	

	public Vehicle(int engineSize) {
		super();
		this.engineSize = engineSize;
	}



	public int getEngineSize() {
		return engineSize;
	}



	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}



	public abstract int numberOfWheels();
	
	
	
	
}
