package org.java.myset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		Set<Integer> numbers = new HashSet<>();
		
		while (numbers.size() < 5) {
			int number = rnd.nextInt(2, 13);
			numbers.add(number);
		}
		System.out.println(numbers);
		}
	
}
