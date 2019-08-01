package com.fdmgroup.firstproject;

public class Exercise1 {

	public static void main(String[] args) {

		/// q1
		String message = "hello";
		System.out.println(message);
		/// q2
		String firstName = "Aaron";
		String secondName = "Kashab";
		String fullName = firstName + " " + secondName;
		System.out.println(fullName);

		/// q3
		String name = "Aaron";
		String sName = "Hello " + name + ", would you like to learn some Java today?";
		System.out.println(sName);
		/// q4
		System.out.println(name.length());
		int lengthName = name.length();
		String nameUpper = name.toUpperCase();
		System.out.println(nameUpper);
		System.out.println(name.substring(1, 2));
		System.out.println(name.substring(lengthName - 1));

		/// q5
		String sentence = "This is a sentence";
		int valueOfSpace = sentence.indexOf(" ");
		System.out.println(valueOfSpace);
		int valueOfSpace2 = sentence.lastIndexOf(" ");
		System.out.println(valueOfSpace2);
		System.out.println(sentence.indexOf("x"));
		System.out.println(sentence.substring(0, 4));
		System.out.println(sentence.substring(10));
		System.out.println(sentence.substring(5, 9));
		System.out.println(sentence.contains("a"));
		System.out.println(sentence.contains("x"));
		String start = "is ";
		String end = "?";
		System.out.println(start.concat(sentence) + end);

		/// Section 2
		/// 2.1
		int favNum = 64;
		System.out.println("My favourite number is " + favNum);

		/// 2.2
		int five = 5;
		int three = 3;
		int out = five + three;
		System.out.println(out);

		/// 2.3

		int counter = 0;
		for (counter = 0; counter < 10; counter++){
		System.out.println(counter);}

		counter = 0;
		for (counter=0;counter<25;counter=counter+5){
			System.out.println(counter);}

		counter = 0;
		for (counter=0;counter>-10;counter-=1){
			System.out.println(counter);}
		
		counter = 0;
		for (counter=0;counter>-10;counter-=2){
			System.out.println(counter);}
		
		counter = 2;
		for (counter=2;counter<20;counter=counter*2){
			System.out.println(counter);}
		
		/// 2.4
		
		int a =5;
		int b =2;
		double c =5;
		double d =2;
		
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(c/b);
		System.out.println(a/d);
		
		/// 3.1
		char letter = 'a';
		int code = 98;
		int letterint = letter;
		System.out.println(letterint);
		char codechar=(char) code;
		System.out.println(codechar);
		System.out.println((char) 36);
		
		
		///3.2
		int cchar='c';
		int achar='a';
		int zchar='z';
		System.out.println(cchar-achar);
		System.out.println(zchar-achar);
		
		///3.3
		
		char char1='x';
		char char2='y';
		char char3='z';
		
		String string1 ="z";
		String string2 ="y";
		System.out.println(char1+char2+char3);
		System.out.println(char1+char2+string2);
		System.out.println(char1+string1+char3);
		
		
		///4.1
		
		String number1="5";
		String number2="3";
		int stringExample1 = Integer.parseInt(number1);
		int stringExample2 = Integer.parseInt(number2);

		System.out.println(stringExample1+stringExample2);
		
		
		///4.2
		String number3="5.3";
		String number4="3.2";
		
		Double stringExample3 = Double.parseDouble(number3);
		Double stringExample4 = Double.parseDouble(number4);
		System.out.println(stringExample3+stringExample4);

		
		///4.3
		String string13="abc11";
		String string14="9xyz";
		String string15="abc7xyz";
	
		
		
		int stringExample13 = Integer.parseInt(string13.replaceAll("[^0-9]", ""));
		int stringExample14 = Integer.parseInt(string14.replaceAll("[^0-9]", ""));
		int stringExample15 = Integer.parseInt(string15.replaceAll("[^0-9]", ""));
		System.out.println(stringExample13+stringExample14+stringExample15);

		
		
		
		
		
	}

}
