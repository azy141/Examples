package com.fdmgroup.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		
		try {
			FileReader fileReader = new FileReader("H:/ade.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String lineOfText = "";
					
					
		
			while( (lineOfText = bufferedReader.readLine() )!= null){
			System.out.println(lineOfText);
			}
			
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
