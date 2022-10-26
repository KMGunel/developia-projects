package lesson16Exams.computerTask;

public class Ram {
private int code;
private String brand;
private int speed;
private int size;
public Ram() {
	
}
public Ram(int code, String brand, int speed, int size) {
	super();
	this.code = code;
	this.brand = brand;
	this.speed = speed;
	this.size = size;
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
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}


@Override
public String toString() {
	return "Ram [code=" + code + ", brand=" + brand + ", speed=" + speed + ", size=" + size + "]";
}

}
