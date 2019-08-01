package com.fdmgroup.abstractclasses;

public class Car extends Vehicle {

private int mpg;
public Car(int mpg, int engineSize){
	super(engineSize);
	this.mpg=mpg;
	}

public int getMpg() {
	return mpg;
}

public void setMpg(int mpg) {
	this.mpg = mpg;
}

public int numberOfWheels() {
	return 4;
}




}
