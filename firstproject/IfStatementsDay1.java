package com.fdmgroup.firstproject;

public class IfStatementsDay1 {

	public static void main(String[] args) {
		
	/*	
		///1.1
		String alienColour="red";
		String green="green";
		String yellow= "yellow";
		String red="red";
		if (alienColour.equals(green)) {
		 System.out.println("You have just earned 5 Points!");
		 
		}
		
		
		///1.2
		else if (alienColour.equals(yellow)){
			System.out.println("You have just earned 10 Points!");
		}
	
		else if (alienColour.equals(red)){
			System.out.println("You have just earned 15 Points!");
		}	
	
		///1.3
		else {
			System.out.println("Invalid Colour");
		}
	*/
		///1.4
		
		int age=7;
		
		if (age<=2) {
			System.out.println("Person is a baby");
			}
		else if (age>=2 && age<4){
			System.out.println("Person is a Toddler");
		}
	
		else if (age>=4 && age<13){
			System.out.println("Person is a Child");
		}
		
		else if (age>=13 && age<20){
			System.out.println("Person is a Teenager");
		}
		
		else if (age>=20 && age<65){
			System.out.println("Person is a Adult");
		}
		
		else if (age>=65){
			System.out.println("Person is a Pensioner");
		}
	
	
		///1.5
		
		int salary=70000;
		
		if (salary<=12500) {
			System.out.println("0%");
			}
		else if (salary>12500 && salary<=50000){
			System.out.println("20%");
		}
	
		else if (salary>50000 && salary<=150000){
			System.out.println("40%");
		}
		
		else if (salary>150000){
			System.out.println("45%");
		}
		
		///2.1
		
		int accountNumber=10000000;
		
		
		if (String.valueOf(accountNumber).length()==8){
			System.out.println("valid account number");
		}
		else System.out.println("Invalid Account Number");
				
		///2.2
		/*String flightcode="BA5";
		String easyJet="EZY";
		if (flightcode.contains(easyJet)){
			System.out.println("EasyJet");
		}
		else System.out.println("Not EasyJet");
	*/
		///2.3
		/*String flightcode="Bj5";
		String easyJet="EZY";
		String britishAirways="BA";
		String airFrance="FR";
		if ((flightcode.contains(easyJet)  || flightcode.contains(britishAirways) || flightcode.contains(airFrance) )){
			System.out.println("Valid Airline");
		}
		
		else System.out.println("Invalid Airline");
	*/
		///2.4
		
		String flightcode="BA";
		String easyJet="EZY";
		String britishAirways="BA";
		String airFrance="FR";
		if (((!flightcode.contains(britishAirways)) && !flightcode.contains(airFrance) && !flightcode.contains(easyJet) )){
			System.out.println("unrecognised or invalid airline");
		}
		
		///2.5
		
		boolean validPassport=false;
		boolean validDrivingLicence=false;
		
		if (validPassport||validDrivingLicence){
			System.out.println("ID Verified");
		}
		else System.out.println("Unable to verify ID"); 
			
		///2.6
		
		boolean hasLicence = true;
		boolean isDead = true;
		boolean hasPassedEyeTest= true;
		
		if (hasLicence && !isDead && hasPassedEyeTest){
			System.out.println("Can still drive");	
		}
				
		else System.out.println("Not licenced to drive");
		
		
		///3.1
		String[] cities ={"Glasgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle"};
		
		for (String i : cities){
			String match=" - doesn't match";
			if (i.contains("B")){
				match=" - Match";
			}
			System.out.println(i+match);
			
		}
		
		
		
		
	}
}