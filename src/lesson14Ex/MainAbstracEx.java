package lesson14Ex;

public class MainAbstracEx {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeNoise();
		cat.setName("Lucy");
		cat.setAge(2);
		System.out.println(cat.getName());
		
		Cat newCat = new Cat();
		newCat.makeNoise();
		newCat.setName("Leo");
		cat.setAge(1);
		
		
		Lion lion = new Lion();
		lion.makeNoise();
		lion.setName("Alex");
		System.out.println(lion.getName());
		
		
		Dog dog = new Dog();
		dog.makeNoise();
		dog.setName("Max");
		dog.setAge(4);
		System.out.println(dog.getAge());
		
		
		Human boy = new Human("Lucas",21,cat);
		System.out.println(boy.getCat().getName());
		boy.setCat(newCat);
		System.out.println(boy.getName() + " bought new cat.His cat name is " + boy.getCat().getName());
		
		

	}

}

