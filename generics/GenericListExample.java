package com.fdmgroup.generics;

import java.util.ArrayList;

public class GenericListExample<T> {

	private ArrayList<T> listItems;

	public ArrayList<T> getListItems() {
		return listItems;
	}

	public void setListItems(ArrayList<T> listItems) {
		this.listItems = listItems;
	}

	public void addItem(T item) {
		listItems.add(item);
	}

	public static void main(String[] args) {

		GenericListExample<Integer> genericListExample = new GenericListExample<Integer>();
		ArrayList<Integer> lisOfIntegers = new ArrayList<Integer>();

		lisOfIntegers.add(1);
		lisOfIntegers.add(2);
		lisOfIntegers.add(3);

		genericListExample.setListItems(lisOfIntegers);

		ArrayList<Integer> storedItems = genericListExample.getListItems();

		for (Integer eachItem : storedItems) {
			System.out.println(eachItem);

		}

		GenericListExample<String> genericListExampleString = new GenericListExample<String>();
		ArrayList<String> stringOfIntegers = new ArrayList<String>();

		stringOfIntegers.add("Aaron");
		stringOfIntegers.add("Kashab");
		stringOfIntegers.add("Test");

		genericListExampleString.setListItems(stringOfIntegers);

		ArrayList<String> storedItemsString = genericListExampleString.getListItems();

		for (String eachString : storedItemsString) {
			System.out.println(eachString);

		}

	}

}
