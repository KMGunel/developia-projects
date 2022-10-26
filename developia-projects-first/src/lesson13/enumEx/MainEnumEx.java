package lesson13.enumEx;

public class MainEnumEx {
	public static void main(String[] args) {
		
		TShirts shirt1 = new TShirts(123,EColor.GREEN,ESize.XS);
		TShirts shirt2 = new TShirts(234,EColor.RED,ESize.S);
		TShirts shirt3 = new TShirts(456,EColor.YELLOW,ESize.XL);
		TShirts shirt4 = new TShirts(678,EColor.WHITE,ESize.M);
		TShirts shirt5 = new TShirts(890,EColor.BLUE,ESize.XXL);
		
		System.out.println(shirt1.getBarcod());
		System.out.println(shirt1.getColor());
		System.out.println(shirt4.getSize());
		System.out.println(shirt2.getSize().getNumSize());
		System.out.println(shirt3.getColor());
		System.out.println(shirt5.getSize().getNumSize());
		
	}
}
