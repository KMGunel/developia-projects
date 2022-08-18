package lesson13.enumEx;

public class TShirts {
	private int barcod;
	private EColor color;
	private ESize size;
	public TShirts(int barcod, EColor color, ESize size) {
		super();
		this.barcod = barcod;
		this.color = color;
		this.size = size;
	}
	public int getBarcod() {
		return barcod;
	}
	public void setBarcod(int barcod) {
		this.barcod = barcod;
	}
	public EColor getColor() {
		return color;
	}
	public void setColor(EColor color) {
		this.color = color;
	}
	public ESize getSize() {
		return size;
	}
	public void setSize(ESize size) {
		this.size = size;
	}
	
	
	
	

}
