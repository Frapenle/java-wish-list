package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> desiresList = new ArrayList<>();
		
		String option = "si";
		while(option.equals("si")) {
			System.out.println("Scrivi un desiderio.");
			String desire = sc.nextLine();
			desiresList.add(desire);
			System.out.println(desiresList.size());
			
			System.out.println("Vuoi inserire un altro desiderio?");
			option = sc.nextLine();
		}		
		sc.close();
		System.out.println("Array di desideri contiene " + desiresList.size() + " elementi: " + desiresList);
	}
}
