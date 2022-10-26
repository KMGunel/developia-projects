package lesson17Exceptions;

import java.util.Arrays;

public class MainExceptions {

	public static void main(String[] args) {
		System.out.println("Main begin..."); 
		
		int a = 5;
		int b=0;
		try {
			System.out.println("Try begin..."); 
			b=a/0;
			System.out.println("...Try end"); 
			
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}		
		System.out.println(b);
		
		int[] myArray = {8,5,6,2,7,5};
		
		try {
			System.out.println(myArray[11]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(Arrays.toString(myArray));
		};
		
		
		Integer myInt=null;
		try {
			@SuppressWarnings("null")
			Integer d= myInt+5;
			System.out.println(d);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}	
		
		System.out.println("...Main end");

	}

}
