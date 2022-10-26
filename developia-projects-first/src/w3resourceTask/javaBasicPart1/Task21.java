package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a decimal number: ");
		int num =sc.nextInt();		
		sc.close();
		System.out.println("Octal number is : "+ desimalToOctal(num));

	}
	public static String desimalToOctal(int num) {
		StringBuilder octal = new StringBuilder();
		String[] arrOctal= {"0","1","2","3","4","5","6","7"};
		while(num>0) {
			octal=octal.append(arrOctal[num%8]);
			num=num/8;
		}
		octal=octal.reverse();
		return octal.toString();
	}

}
