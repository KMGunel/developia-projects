package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		sc.close();
		sumNumbers(a,b);

	}
	public static void sumNumbers(int a,int b) {
		System.out.println(a+b);
	}

}
