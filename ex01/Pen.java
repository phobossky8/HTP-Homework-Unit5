package by.ldy.hw5.ex01;

public class Pen extends WritingAccessory{
	
	private String penColour;
	
	public Pen () {
		
	}
	
	public Pen(String brand, double price, double length, String bodyColour, double lineThickness, String penColour) {
		super(brand, price, length, bodyColour, lineThickness);		
		this.penColour = penColour;
	}

	public String getPenColour() {
		return penColour;
	}

	public void setPenColour(String penColour) {
		this.penColour = penColour;
	}
	
	@Override
	public String getInfo() {
		System.out.print("Pen info: ");
		return super.getInfo() + ", PenColour: " + penColour;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((penColour == null) ? 0 : penColour.hashCode());
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
		Pen other = (Pen) obj;
		if (penColour == null) {
			if (other.penColour != null)
				return false;
		} else if (!penColour.equals(other.penColour))
			return false;
		return true;
	}

	
	
	
	
}
