package w3resourceTask.arraysTask;

public class Task10 {

	public static void main(String[] args) {
		int[] array = {2,-56,125,89,56,45,47};
		System.out.println(findMax(array));
		System.out.println(findMin(array));
		

	}
	public static int findMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max=array[i];
			}
		}
		return max;
	}
	public static int findMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min=array[i];
			}
		}
		return min;
	}

}
