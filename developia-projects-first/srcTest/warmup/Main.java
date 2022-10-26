package warmup;

public class Main {
	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Animal catanimal= new Cat();
		System.out.println("_____________");
		cat.eating();
		cat.makeNoise();
		catanimal.eating();
		catanimal.makeNoise();
		System.out.println("_______________");
		Cat.sleeping();
		Animal.sleeping();
		System.out.println(catanimal.foot);
		System.out.println(catanimal.species);
		System.out.println(cat.foot);
		System.out.println(cat.species);
		System.out.println("_______________");
		
		
	}
}
