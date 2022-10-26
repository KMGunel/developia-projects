package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		swapNumbers(a,b);

	}
	public static void swapNumbers(int a,int b) {
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println(a + " and " + b);
	}

}
