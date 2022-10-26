package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");	
		String binary = sc.next();
		sc.close();
		
		System.out.println(BinaryToOctal(binary));

	}
	public static String BinaryToOctal( String binary) {
		String[] arrOctal= {"0","1","2","3","4","5","6","7"};
		String [] strArr = binary.split("");
		StringBuilder result = new StringBuilder();
		int[] arr = new int[binary.length()];
		
		for(int i = strArr.length-1,j=0;i>=0;i--,j++) {
			arr[j]=Integer.valueOf(strArr[i]);
		}
		
		int sum = 0;
		for (int i = 0,j=0; i < arr.length; i++,j++) {
			while((i+1)%3==0) {
				j=j-3;
				if(arr[i]!=0) {
				sum+=Math.pow(2, j);
			}result= result.append(arrOctal[sum]);}
		}
		
		return result.toString();
	}
}
