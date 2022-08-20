package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		sc.close();		
		averageNum(a,b,c);

	}
	public static void averageNum(double a,double b,double c) {
		double average = (a+b+c)/3;
		
		System.out.println("Average number is = " + average);
	}

}
