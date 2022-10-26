package lesson17Exceptions;

public class MainExceptionsWithThrows {

	public static void main(String[] args) {
		System.out.println("Main begin");
		String[] myArr = {"color","size","weight","height"};
		
		try {
			System.out.println(foo(myArr,9));
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main end");
	}
	
	public static String foo(String[] arr,int index) throws ArrayIndexOutOfBoundsException{
		return arr[index];
	}

}
