package by.ldy.hw5.ex01;

public class Pencil extends WritingAccessory {
	
	private String softness;
	
	
	public Pencil () {
		
	}
	
	public Pencil(String brand, double price, double length, String bodyColour, double lineThickness, String softness) {
		super(brand, price, length, bodyColour, lineThickness);
		this.softness = softness;	
	}

	public String getSoftness() {
		return softness;
	}

	public void setSoftness(String softness) {
		this.softness = softness;
	}
	
	@Override
	public String getInfo() {
		System.out.print("Pencil info: ");
		return super.getInfo() + ", Softness: " + softness;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((softness == null) ? 0 : softness.hashCode());
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
		Pencil other = (Pencil) obj;
		if (softness == null) {
			if (other.softness != null)
				return false;
		} else if (!softness.equals(other.softness))
			return false;
		return true;
	}

	

	
	
}
