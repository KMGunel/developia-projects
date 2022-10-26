package lesson18Collections.Task2;

public class Computer {
	int id;
	String model;
	int ram;	
	
	public Computer() {
		
	}

	public Computer(int id, String model, int ram) {
		super();
		this.id = id;
		this.model = model;
		this.ram = ram;
	}



	@Override
	public String toString() {
		return model + "[id=" + id + ",  ram=" + ram + "]";
	}
	
}
