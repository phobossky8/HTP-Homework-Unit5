package by.ldy.hw5.ex01;

public class OfficerRuler extends Ruler {

	private String hasManyShapes;

	public OfficerRuler() {

	}

	public OfficerRuler(String brand, double price, int length, String shape, String hasManyShapes) {
		super(brand, price, length, shape);
		this.hasManyShapes = hasManyShapes;
	}

	public String getHasManyShapes() {
		return hasManyShapes;
	}

	public void setHasManyShapes(String hasManyShapes) {
		this.hasManyShapes = hasManyShapes;
	}
	
	@Override
	public String getInfo() {
		System.out.print("OfficerRuler info: ");
		return super.getInfo() + ", Other functional: " + hasManyShapes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((hasManyShapes == null) ? 0 : hasManyShapes.hashCode());
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
		OfficerRuler other = (OfficerRuler) obj;
		if (hasManyShapes == null) {
			if (other.hasManyShapes != null)
				return false;
		} else if (!hasManyShapes.equals(other.hasManyShapes))
			return false;
		return true;
	}
	
	

}
