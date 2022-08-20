package w3resourceTask.javaBasicPart1;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a Binary Number : ");	
		String binaryNum = sc.next();
		sc.close();
		
		System.out.println(BinaryToDesimal(binaryNum));

	}
	public static int BinaryToDesimal( String binaryNum) {
		String [] strArr = binaryNum.split("");
		int[] arr = new int[binaryNum.length()];
		
		for(int i = strArr.length-1,j=0;i>=0;i--,j++) {
			arr[j]=Integer.valueOf(strArr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				sum+=Math.pow(2, i);
			}
		}
		return sum;		
	}
}
