package com.fdmgroup.fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
	
	public void registerUser(){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("User registration program Started");
	System.out.println("Please enter your name: ");
	String name = scanner.nextLine();
	
	System.out.println("Please enter your address: ");
	String address = scanner.nextLine();
			
	System.out.println("Please enter your email: ");		
	String email = scanner.nextLine();
	
	try {
		FileWriter fileWriter = new FileWriter("H:/users.txt", true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(name+","+address+","+email);
		bufferedWriter.newLine();
				
		bufferedWriter.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

}
}

public static void main(String[] args) {
	Q2 newex = new Q2();
	newex.registerUser();
	
}}

