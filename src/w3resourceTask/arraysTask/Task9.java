package w3resourceTask.arraysTask;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		String[] arr = {"white","black","red","green","yellow"};
		
		insertElement(arr,4,"orange");
		System.out.println("Inserted!");
		

	}
	public static void insertElement(String[] arr,int index,String element) {
		String myArr []= new String [arr.length+1];	
		
		for (int i = 0; i < myArr.length; i++) {
			if(i==index) {
				myArr[i]=element;
			}
			else if (i<index) {
				myArr[i]=arr[i];
			}
			else {					
				myArr[i]=arr[index];
				index++;			
			}
				
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(myArr));
	}
	
}
