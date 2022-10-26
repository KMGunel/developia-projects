package w3resourceTask.javaBasicPart1;


import java.util.Scanner;

public class Task20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a decimal number: ");
		int num =sc.nextInt();		
		sc.close();
		System.out.println("Hexadecimal number is : "+ desimalToHexa(num));

	}
	public static String desimalToHexa(int num) {
		StringBuilder hexadec = new StringBuilder();
		String[] arrHex= {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		while(num>0) {
			hexadec=hexadec.append(arrHex[num%16]);
			num=num/16;
		}
		hexadec=hexadec.reverse();
		return hexadec.toString();
	}

}
