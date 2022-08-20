package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a Decimal Number : ");	
		int number = sc.nextInt();
		sc.close();
		System.out.println("Binary number is: " + decimalToBinary(number));	
		;
			
	}
	public static String decimalToBinary(int number) {
		StringBuilder newStr = new StringBuilder();
		
		while(number!=0) {						
			newStr.append(number%2);
			number=number/2;
		}
		newStr=newStr.reverse();
		return newStr.toString();	
	}
}