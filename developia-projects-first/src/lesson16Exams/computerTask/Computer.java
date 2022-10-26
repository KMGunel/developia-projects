package lesson16Exams.computerTask;

public class Computer implements Cloneable  {
	
	private int code;
	private String brand;
	private String model;
	private Ram ram;
	
	public Computer() {	
		
	}

	public Computer(int code, String brand, String model, Ram ram) {
		this.code = code;
		this.brand = brand;
		this.model = model;
		this.ram = ram;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Computer obyekti silinir...");
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Computer [code=" + code + ", brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
	}
	
	
}
