package com.fdmgroup.com.week2.ex3;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateWords {	
public static void main(String[] args) {
	
			System.out.println("Please enter a string");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			name = name.toLowerCase();
	        String words[] = name.split(" ");  
	        int wordcount = 0;
			HashMap<String, Integer> hashMapOfWords = new HashMap<String, Integer>();
			
			
			for (int i = 0 ; i < words.length; i++) {

				if (hashMapOfWords.containsKey(words[i])) {
					wordcount = hashMapOfWords.get(words[i]);
					wordcount++;
					hashMapOfWords.put(words[i], wordcount);} 
				
				else {
					hashMapOfWords.put(words[i],  1 );}
		
				System.out.println(hashMapOfWords);
			}
			
			
			
			
			

		}
}

	
	

