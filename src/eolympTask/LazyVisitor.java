package eolympTask;

import java.util.Scanner;

public class LazyVisitor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][]arr= new int[n][2];
		
		for(int i = 0;i<arr.length;i++) {				
				arr[i][0]= sc.nextInt();
				arr[i][1]= sc.nextInt();			
		}
		
		int count=0;		
		for(int i = 0;i<arr.length;i++) {	
			for(int j = arr[i][0];j<=arr[i][1];j++) {
				if(i<arr.length-1) {
					for(int k = arr[i+1][0];k<=arr[i+1][1];k++) {
						if(j==k) {
							System.out.println(i);					
							count++;
							break;
						}					
						
					}
					
					break;						
				}
			}
		}
		
		if(count ==0 ) {
		System.out.println("Result = " + n);
		}
		else {
			System.out.println("Result = " + count);
		}
		
		
	}		
}				

