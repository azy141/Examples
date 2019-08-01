package com.fdmgroup.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
	int counter = 0;

	public void reader() {
		List<Users> users = new ArrayList<Users>();
		try {
			FileReader fileReader = new FileReader("H:/users.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String lineOfText = "";
			
			while( (lineOfText = bufferedReader.readLine() )!= null){
				String userDetails = lineOfText;
				String[] parts = userDetails.split(",");
				
				String name = parts[0];
				String address = parts[1];
				String email = parts[2];
				
				
				
			 
			 Users newUser = new Users();
			 newUser.userMaker(name, address, email);
			 users.add(newUser);
			}
			
			bufferedReader.close();
			System.out.println(users);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Q3 q3 = new Q3();
		q3.reader();
	}

}
