package lesson19.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainMapNames {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Fidan");
		names.add("Murad");
		names.add("Nubar");
		names.add("Mustafa");
		names.add("Nubar");
		names.add("Cavad");
		names.add("Mustafa");
		names.add("Mustafa");
		names.add("Fidan");
		names.add("Araz");
		
		System.out.println(names);
		
		Map<String,Integer> myMap = new HashMap<>();
		
		for (String name : names) {
			if(myMap.containsKey(name)) {
				int count= myMap.get(name);
				count++;
				myMap.replace(name, count);
			}
			else {
				myMap.put(name, 1);
			}
		}
		System.out.println(myMap);
	}

}
