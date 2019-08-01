package com.fdmgroup.arraylisttdd;

import java.util.ArrayList;

public class ArrayListContainer {
	ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

	public int listSize() {
		return 0;
	}

	public ArrayList<Integer> getList() {
		return listOfIntegers;
	}

	public void addItem(int value) {
		listOfIntegers.add(value);
		

	}

	public Integer getItem(int index) {
		Integer item = listOfIntegers.get(index);
		return item;
	}

}
