package com.fdmgroup.generics;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class GenericMapExample<K,V> {

	private HashMap<K,V> hashMapItems;
	
	
	
	
	public HashMap<K, V> getHashMapItems() {
		return hashMapItems;
	}


	public void setHashMapItems(HashMap<K, V> hashMapItems) {
		this.hashMapItems = hashMapItems;
	}

	public Set<K> getKeys(){
		return hashMapItems.keySet();
	}
	
	public Collection<V> getValues(){
		return hashMapItems.values();
	}
	
	public Set<Entry<K, V>> getEntries(){
		return hashMapItems.entrySet();
	}

	public void addItem(K key, V value){
		hashMapItems.put(key, value);
	}
	
	public static void main(String[] args) {

		GenericMapExample<Integer,String> genericMapExample= new GenericMapExample<Integer,String>();
		HashMap<Integer,String> hashMapItems = new HashMap<Integer,String>();
		
		hashMapItems.put(1,"Aaron");
		hashMapItems.put(2,"Kashab");
		hashMapItems.put(3,"Generic");
		
		genericMapExample.setHashMapItems(hashMapItems);
		
		
		Set<Integer> setIntegers = genericMapExample.getKeys();
		
		for(Integer eachInteger: setIntegers){
			System.out.println(eachInteger);
			
		}
		
		Set<Entry<Integer,String>> setEntries = genericMapExample.getEntries();
		
		for(Entry<Integer,String> eachEntry:setEntries){
			System.out.println(eachEntry.getKey());
			System.out.printf(eachEntry.getValue());
		}
		
		
		
		
		
	}

}
