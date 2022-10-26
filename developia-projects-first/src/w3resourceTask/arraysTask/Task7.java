package w3resourceTask.arraysTask;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {
		 
		String[] arr = {"white","black","red","green","yellow"};
		
		deleteElement(arr,"red");
		System.out.println("Deleted!");
		
		

	}
	public static void deleteElement(String[] arr,String element) {
		String myArr []= new String [arr.length-1];
		
		for (int i = 0,j=0; i < arr.length; i++) {
			
			if(element.equals(arr[i])){
				continue;
			}
			else if (!(element.equals(arr[i])) && j<myArr.length) {
				myArr[j]=arr[i];
				j++;			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(myArr));
		
	}
}
