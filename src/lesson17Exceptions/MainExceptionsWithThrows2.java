package lesson17Exceptions;

public class MainExceptionsWithThrows2 {

	public static void main(String[] args) {
		System.out.println("Main begin");
		
		try {
			foo2();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main end");
	}
	
	public static void foo() throws ArithmeticException{
		foo1();
	}
	public static void foo1() throws ArithmeticException{
		foo2();
	} 
	public static void foo2() throws ArithmeticException {
		System.out.println(5/0);
	}

}
