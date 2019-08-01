package com.fdmgroup.collections;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> setOfIntegers = new HashSet<Integer>();
		
		setOfIntegers.add(1);
		setOfIntegers.add(2);
		setOfIntegers.add(3);

		System.out.println(setOfIntegers.size());
		
		
		Iterator<Integer> iteratorOfInts= setOfIntegers.iterator();
		
		
		while(iteratorOfInts.hasNext()){
			System.out.println(iteratorOfInts.next());
		}
		
		
	}
}
