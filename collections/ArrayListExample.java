package com.fdmgroup.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Integer> integerList = new ArrayList<Integer>();
		
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		integerList.add(4);
		integerList.add(5);
		
		Integer item = integerList.get(4);
		
		System.out.println(item);
		System.out.println(integerList.get(3));
		integerList.remove(3);
		
		System.out.println(integerList.get(3));
		System.out.printf("There are %d items in the list",integerList.size());
		int listSize = integerList.size();
		System.out.println(listSize);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
