package com.fdmgroup.com.week2.ex3;

import java.util.HashMap;
import java.util.Scanner;

public class Occurrences {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		HashMap<String, Integer> counter = new HashMap();
		for (char character : name.toCharArray()) {
			String change = String.valueOf(character);
			String str = change;

			if (!counter.containsKey(str)) {
				counter.put(str, 1);
			} else {
				counter.put(str, counter.get(str) + 1);
			}
		}
		System.out.println(counter);

	}

}
