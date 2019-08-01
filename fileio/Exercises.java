package com.fdmgroup.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercises {

	
	
public int letterCounter(String filename,char charToSearch){		
		int counter = 0;
		
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			int ch = 0;      
	        while((ch=bufferedReader.read()) != -1) {
	            if(charToSearch == (char)ch) {
	                counter++;		
	            }}
	        System.out.println(counter);
			
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return counter;
		
		
		
		
		
	}

public static void main(String[] args) {
	Exercises newex = new Exercises();
	newex.letterCounter("H:/ade.txt", 'e');
}
	
}
