package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b= sc.nextDouble();
		sc.close();
		divideNumbers(a,b);

	}
	public static void divideNumbers(double a,double b) {
		System.out.println((long)(a/b));
	}

}
