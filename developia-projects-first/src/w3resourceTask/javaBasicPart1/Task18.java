package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first binary number: ");
		String first =sc.next();
		System.out.print("Input second binary number: ");
		String second =sc.next();
		sc.close();		
		
		int a = Task22.BinaryToDesimal(first);
		int b = Task22.BinaryToDesimal(second);
		System.out.println("Product of two binary numbers: " + Task19.decimalToBinary(multiplyNumbers(a,b)));
		
	}
	
	public static int multiplyNumbers(int a,int b) {		
		return a*b;		
	}
}
