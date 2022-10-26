package lesson17Exceptions;

public class MainExceptionsWithThrow {

	public static void main(String[] args) {
		System.out.println("Main begin");		
		String[] myArr = {"color","size","weight","height"};		
		String str="Exception";
		char ch = '*';		
		
		
		try {
			str=foo1(myArr,4);			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}		
		System.out.println(str);		
		
		
		
		try {			
			ch=foo2(str,18);			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}		
		System.out.println(ch);
		
		
		
		System.out.println("Main end");		
	}
	
	public static String foo1(String[] arr, int index) {
		 if ( index >=arr.length  || index < 0 ) {
			throw new ArrayIndexOutOfBoundsException("Arrayin olmayan elementine muraciet");
			
		 }		
		return arr[index];
	}

	
	public static char foo2(String str,int index) {
		 if ( index >=str.length()  || index < 0 ) {
			throw new IndexOutOfBoundsException("Stringin olmayan elementine muraciet");
			
		 }		
		return str.charAt(index);
	}
	

}
