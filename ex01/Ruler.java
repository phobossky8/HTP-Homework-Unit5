package by.ldy.hw5.ex01;

public class Ruler extends Stationery {

	private int length;
	private String shape;
	
	public Ruler () {
		
	}
	
	public Ruler (String brand, double price, int length, String shape) {
		super(brand, price);
		this.length = length;
		this.shape = shape;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
	
	@Override
	public String getInfo() {
		System.out.print("Ruler info: ");
		return super.getInfo() + ", Length: " + length + "cm, Shape: " + shape;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + length;
		result = prime * result + ((shape == null) ? 0 : shape.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ruler other = (Ruler) obj;
		if (length != other.length)
			return false;
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		return true;
	}
	
	
}
