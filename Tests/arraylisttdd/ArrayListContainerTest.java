package com.fdmgroup.arraylisttdd;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class ArrayListContainerTest {

	@Test
	public void testThatWhenTheListSizeMethodIsCalledOnTheArrayListContainerItReturnsASizeOfZero(){
	
	ArrayListContainer arrayListContainer = new ArrayListContainer();
	int size = arrayListContainer.listSize();
	assertEquals(0,size);
	
	
}
	
	@Test
	public void testThatWhenTheGetListSizeMethodIsCalledItReturnsAnEmptyList(){
	
	ArrayListContainer arrayListContainer = new ArrayListContainer();
	ArrayList<Integer> listOfIntegers = arrayListContainer.getList();
	int size = listOfIntegers.size();
	assertEquals(0,size);
	
	
}
	
	@Test
	public void testThatWhenAnItemIsAddedTheArrayListContainerReturnsAListWithOneItem(){
	
	ArrayListContainer arrayListContainer = new ArrayListContainer();
	arrayListContainer.addItem(1);
	ArrayList<Integer> listOfIntegers = arrayListContainer.getList();
	int size = listOfIntegers.size();
	assertEquals(1,size);
	
	
	
	}
	
	@Test
	public void testThatWhenAnItemIsAddedTheArrayListContainerReturnsAListContainingTheItemWithAValueOfOne(){
	
	ArrayListContainer arrayListContainer = new ArrayListContainer();
	arrayListContainer.addItem(1);
	ArrayList<Integer> listOfIntegers = arrayListContainer.getList();
	Integer item = listOfIntegers.get(0);
	assertEquals(1,item.intValue());
	
	
	
	}
	
	@Test
	public void testThatWhenAnItemIsAddedTheGetItemMethodReturnsAnItemWithAValueOfOne(){
	
	ArrayListContainer arrayListContainer = new ArrayListContainer();
	arrayListContainer.addItem(1);
	Integer item = arrayListContainer.getItem(0);
	assertEquals(1,item.intValue());
	
	
	}
}
