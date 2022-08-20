package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int a=sc.nextInt();
		sc.close();		
		multiplication(a);

	}
	public static void multiplication(int a) {
		
		for ( int i =1;i<=10;i++) {
		System.out.println(a + " x " + i + " = " + a*i);
		}
	}

}
