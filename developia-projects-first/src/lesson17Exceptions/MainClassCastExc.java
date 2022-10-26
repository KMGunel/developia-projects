package lesson17Exceptions;

public class MainClassCastExc {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Animal newCat=cat;
		dog.name="Rock";
		try {
			Dog newDog=(Dog)newCat;
			newDog.name="Max";
			System.out.println(newDog.name);
						
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(dog.name);
		

	}
}
