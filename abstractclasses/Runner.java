package com.fdmgroup.abstractclasses;

public class Runner {

public static void main(String[] args) {
	Car car =new Car(60,1400);
	System.out.println(car.getEngineSize());
	System.out.println(car.numberOfWheels());
	System.out.println(car.getMpg());

}


}
