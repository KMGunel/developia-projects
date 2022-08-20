package w3resourceTask.javaBasicPart1;


public class Task13 {

	public static void main(String[] args) {
		double width = 5.5;
		double height = 8.5;
			
		infoRectangle(width,height);

	}
	public static void infoRectangle(double width,double height) {
		double area = width*height;
		double perimeter = 2 * (width+height);
		
		System.out.println("Area is = " + width + " x " + height + " = " + area  + "\n" + "Perimeter is = "+ 2 + " x " + " ( " + width + " + " + height + " ) " + " = " + perimeter);
	}

}
