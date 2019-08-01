package com.fdmgroup.carmockito;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class CarTest {

	@Test
	public void testThatWhenTheDriveMethodIsCalledOnTheCarObjectThatTheSpinMethodIsCalledOnTheWheelObject(){
		//arrange
		Car car = new Car();
		Wheel mockWheel = mock(Wheel.class);
		car.setWheel(mockWheel);
		
		//act
		car.drive();
		//assert
		verify(mockWheel, times(1)).spin();
		
		
		
		
	}
	
	@Test
	public void testThatWhenTheAccelerateMethodIsCalledOnTheCarObjectThatTheSpinMethodIsCalledTwiceOnTheWheelObject(){
		//arrange
		Car car = new Car();
		Wheel mockWheel = mock(Wheel.class);
		car.setWheel(mockWheel);
		
		
		//act
		car.accelerate(10,"Test");
		//assert
		verify(mockWheel, times(1)).spin();
		verify(mockWheel, times(1)).spin(anyInt());
		verify(mockWheel, times(1)).spin("Test");
		verify(mockWheel, times(1)).spin(10,"Test"); // could also use anyString
		verify(mockWheel, times(1)).spin(anyInt(),eq("Test")); // could also use anyString

		when(mockWheel.getWheelSize()).thenReturn(20);
		
		
	}
	
	
	
	
	
}
