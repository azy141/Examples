package com.fdmgroup.com.week2.ex3;

import java.util.HashSet;
import java.util.Set;

public class CollectionClass {
		
		 HashSet<String> setOfNames = new HashSet<String>();

		
		
		public Set<String> NameSets(String ...names){
			for (String value: names) {
				setOfNames.add(value);
							
		}
		return setOfNames;
		
		
}
}
