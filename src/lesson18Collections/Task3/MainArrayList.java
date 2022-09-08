package lesson18Collections.Task3;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Adil");
	names.add("Həsən");
	names.add("Əli");
	names.add("Məhəmməd");
	names.add("Xalid");
	
	System.out.println(names);
	System.out.println(names.indexOf("Əli"));
	System.out.println(names.get(2));
	names.remove(0);
	System.out.println(names);
	
	names.removeAll(names);
	System.out.println(names);
	System.out.println(names.isEmpty());	
	}
	

}
