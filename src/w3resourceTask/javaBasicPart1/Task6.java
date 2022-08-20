package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int a=sc.nextInt();
		System.out.print("Input second number: ");
		int b= sc.nextInt();
		sc.close();
		mathNumbers(a,b);

	}
	public static void mathNumbers(int a,int b) {
		
		System.out.println(a + " + " + b + " = " + a+b);
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " x " + b + " = " + a*b);
		System.out.println(a + " / " + b + " = " + a/b);
		System.out.println(a + " mod " + b + " = " + a%b);
	}

}
