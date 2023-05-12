package org.java.mymap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		String str = "Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam - repudiandae est, alias in ullam excepturi ipsam modi odio Lorem ipsum dolor asperiores voluptatum, # quam distinctio ! Lorem ipsum dolor, sit amet consectetur adipisicing elit. Totam repudiandae Totam repudiandae est ; accusantium voluptatum, quam distinctio aut magnam quod veniam esse nesciunt debitis.";
		System.out.println(Arrays.asList(str.split(" ")));
		String[] wordList = str.split(" ");
		System.out.println("------------------");

		{
			Map<String, Integer> occCounter = new HashMap<>();
		for (String word : wordList) {
			word.toLowerCase();
			if(occCounter.containsKey(word)) {
				occCounter.put(word, occCounter.get(word) + 1);
			} else {
				occCounter.put(word, 1);
			}
		}
		System.out.println("Stringa completa: " + occCounter);
		}
		
		{
			Map<String, Integer> occCounter = new HashMap<>();
		for (String word : wordList) {
			word = word.toLowerCase().replaceAll("[^a-zA-Z ]", "");
			if (word.trim().isEmpty()) {
		        continue;
		    }
			if(occCounter.containsKey(word)) {
				occCounter.put(word, occCounter.get(word) + 1);
			} else {
				occCounter.put(word, 1);
			}
		}
		System.out.println("Solo alfabetici: " + occCounter);
		}
		
	
	}
}
