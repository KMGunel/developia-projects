package w3resourceTask.arraysTask;

public class Task7 {

	public static void main(String[] args) {
		 
		String[] arr = {"white","black","red","green","yellow"};
		
		deleteElement(arr,"green");
		System.out.println("Deleted!");
		
		

	}
	public static void deleteElement(String[] arr,String element) {
		String myArr []= new String [arr.length-1];
		for (int i = 0,j=0; i < arr.length; i++) {
			if(!(element.equals(arr[i]))) {
				myArr[j]=arr[i];
			}
			else {
				continue;
			}
			System.out.println(myArr[j]);
		}
		
	}

}
