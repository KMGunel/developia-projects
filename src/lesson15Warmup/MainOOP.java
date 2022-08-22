package lesson15Warmup;


public class MainOOP {

	public static void main(String[] args) {
		Human h1 = new Employee(3,"Ayxan","055",500);
		Human h2 = new Employee(5,"Ferid","033",700);
		
		System.out.println(h1);
		System.out.println(h2);
		
		if(h1.equals(h2)) {
			System.out.println("Eyni ishchidirler.");
		}
	}

}
