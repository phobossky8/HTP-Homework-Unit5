package by.ldy.hw5.ex01;

public class WritingAccessory extends Stationery {

	private double length;
	private String bodyColour;
	private double lineThickness;
	
	public WritingAccessory() {
		
	}
	
	public WritingAccessory (String brand, double price, double length, String bodyColour, double lineThickness) {
		super(brand, price);
		this.length = length;
		this.bodyColour = bodyColour;
		this.lineThickness = lineThickness;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public String getBodyColor() {
		return bodyColour;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColour = bodyColor;
	}
	
	
	
	public double getLineThickness() {
		return lineThickness;
	}

	public void setLineThickness(double lineThickness) {
		this.lineThickness = lineThickness;
	}

	@Override
	public String getInfo () {
		return super.getInfo() + "Length: " + length + "cm, Colour: " + bodyColour + ", LineThickness: " + lineThickness + "mm";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bodyColour == null) ? 0 : bodyColour.hashCode());
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(lineThickness);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		WritingAccessory other = (WritingAccessory) obj;
		if (bodyColour == null) {
			if (other.bodyColour != null)
				return false;
		} else if (!bodyColour.equals(other.bodyColour))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (Double.doubleToLongBits(lineThickness) != Double.doubleToLongBits(other.lineThickness))
			return false;
		return true;
	}

	
	
}
