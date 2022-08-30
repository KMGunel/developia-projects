package w3resourceTask.arraysTask;

public class Task12 {

	public static void main(String[] args) {
		int[] arr = {7,4,6,2,4,8,4,6,9,11};
		
		for (int i = 0,j=1; i < arr.length; i++) {
			
				if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
				
				}
				j++;
				if(j==arr.length-1) {
					break;
				}
												
		
		}
	}
}
