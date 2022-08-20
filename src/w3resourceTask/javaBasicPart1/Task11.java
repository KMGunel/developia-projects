package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		double r=sc.nextDouble();
		sc.close();		
		infoCircle(r);

	}
	public static void infoCircle(double r) {
		double perimeter = 2 * Math.PI * r;
		double area = Math.PI * Math.pow(r, 2);
		
		System.out.println("Perimeter is = " + perimeter + "\n" + "Area is = " + area);
	}

}
