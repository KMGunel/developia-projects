package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first binary number: ");
		String first =sc.next();
		System.out.print("Input second binary number: ");
		String second =sc.next();
		sc.close();		
		
		int a = Task22.BinaryToDesimal(first);
		int b = Task22.BinaryToDesimal(second);
		
		System.out.println("Sum of two binary numbers: " + Task19.decimalToBinary(sumNumbers(a,b)));

	}
	
	public static int sumNumbers(int a,int b) {		
		return a+b;		
	}
}
