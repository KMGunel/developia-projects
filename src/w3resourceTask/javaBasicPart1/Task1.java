package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
			String name =sc.nextLine();
			sc.close();
			helloName(name);
		}
	public static void helloName(String name) {
		System.out.printf("Hello\n%s",name);
	}
}