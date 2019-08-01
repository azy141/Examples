package com.fdmgroup.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String,String> hashMapDetails = new HashMap<String,String>();
		
		
		hashMapDetails.put("aaron.kashab@fdmgroup.com", "Aaron Kashab");
		hashMapDetails.put("nick@fdmgroup.com", "Nick Lawton");
		
		System.out.println(hashMapDetails);
		
		
		boolean exists = hashMapDetails.containsKey("aaron.kashab@fdmgroup.com");
		if(exists){
			System.out.println("Key already exists");
			String value = hashMapDetails.get("aaron.kashab@fdmgroup.com");
			System.out.println(value);
			}
		
		
		Set<Entry<String,String>> allEntries = hashMapDetails.entrySet();
		
		for (    Entry<String, String> eachEntry:     allEntries){
		String key = eachEntry.getKey();
		String value = eachEntry.getValue();
		
		System.out.println("Key :" + key + " Value: "+value);
		}
		
	
	
	Collection<String> allvalues = hashMapDetails.values();
	for (String eachValue : allvalues) {
		System.out.println(eachValue);
	}
	
	Set<String> allKeys = hashMapDetails.keySet();
	for(String eachKey: allKeys){
		System.out.println(eachKey);
	}
	
	
	
	}
}
