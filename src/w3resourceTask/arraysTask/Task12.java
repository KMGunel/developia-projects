package w3resourceTask.arraysTask;

public class Task12 {

	public static void main(String[] args) {
		int[] arr = {2,4,6,2,4,85,11,45,6,99};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.println(arr[j]);
					break;		
			}			
		}			
		}		
	}
}
