package lesson18Collections.Task2;

import java.util.LinkedList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		List<Computer> myList = new LinkedList<Computer>();
		
		Computer acer = new Computer(222,"Acer",16);
		Computer asus = new Computer(333,"Asus",8);
		
		myList.add(new Computer(111,"Dell",8));
		myList.add(acer);
		myList.add(asus);
		
		System.out.println(myList);

	}

	

}
