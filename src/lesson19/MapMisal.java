package lesson19;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapMisal {

	public static void main(String[] args) {
		Map<Integer,Integer> myMap = new HashMap<>();
		int[] massivim = new int[100];
		Random rand = new Random();
		
		for (int i = 0; i < massivim.length; i++) {
			massivim[i]=rand.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(massivim));
		
		for (int i : massivim) {
			if(myMap.containsKey(i)) {
				int v=myMap.get(i);
				v++;
				myMap.replace(i, v);
			}
			else {
				myMap.put(i, 1);
			}
		}
		
		System.out.println(myMap);
		

	}
}
