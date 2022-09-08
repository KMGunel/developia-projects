package lesson19.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Computer> myList = new ArrayList<>();
		
		myList.add(new Computer(111,"acer",16));
		myList.add(new Computer(333,"lenovo",8));
		myList.add(new Computer(111,"dell",32));
		System.out.println("My first list:");
		for (Computer computer : myList) {
			System.out.println( computer);
		}
		
		Collections.sort(myList);
		System.out.println("My list sorted by ram:");
		for (Computer computer : myList) {
			System.out.println(computer);
		}
		
		Collections.sort(myList, new ModelComparator());
		System.out.println("My list sorted by model with comparator:");
		for (Computer computer : myList) {
			System.out.println(computer);
		}
		
		Collections.sort(myList, new RamComparator());
		System.out.println("My list sorted by ram with comparator:");
		for (Computer computer : myList) {
			System.out.println(computer);
		}

	}

}
