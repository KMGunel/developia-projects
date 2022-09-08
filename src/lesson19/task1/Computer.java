package lesson19.task1;

public class Computer implements Comparable<Computer>{
	int id;
	String model;
	int ram;
	public Computer(int id, String model, int ram) {
		
		this.id = id;
		this.model = model;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return model + " [id=" + id + ", ram=" + ram + "]";
	}
	
	@Override
	public int compareTo(Computer o) {
		return this.ram-o.ram;
	}
	
	
	
	
}
