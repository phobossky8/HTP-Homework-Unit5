package by.ldy.hw5.ex01;

public class Rubber extends Stationery {
		
	private String shape;
	private int size;
	
	public Rubber() {
		
	}
	
	public Rubber(String brand, double price, String shape, int size) {
		super(brand, price);
		this.shape = shape;
		this.size = size;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String getInfo() {
		System.out.print("Rubber info: ");
		return super.getInfo() + ", Shape: " + shape + ", Size: " + size + "cm ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((shape == null) ? 0 : shape.hashCode());
		result = prime * result + size;
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
		Rubber other = (Rubber) obj;
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	
	
}
