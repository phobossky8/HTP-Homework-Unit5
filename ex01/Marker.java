package by.ldy.hw5.ex01;

public class Marker extends WritingAccessory {

	private String markerColor;
	private String markerType;

	public Marker() {

	}

	public Marker(String brand, double price, double length, String bodyColour, double lineThickness,
			String markerColor, String markerType) {
		super(brand, price, length, bodyColour, lineThickness);
		this.markerColor = markerColor;
		this.markerType = markerType;
	}

	public String getMarkerColor() {
		return markerColor;
	}

	public void setMarkerColor(String markerColor) {
		this.markerColor = markerColor;
	}

	public String getMarkerType() {
		return markerType;
	}

	public void setMarkerType(String markerType) {
		this.markerType = markerType;
	}

	@Override
	public String getInfo() {
		System.out.print("Marker info: ");
		return super.getInfo() + ", MarkerColor: " + markerColor + ", MarkerType: " + markerType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((markerColor == null) ? 0 : markerColor.hashCode());
		result = prime * result + ((markerType == null) ? 0 : markerType.hashCode());
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
		Marker other = (Marker) obj;
		if (markerColor == null) {
			if (other.markerColor != null)
				return false;
		} else if (!markerColor.equals(other.markerColor))
			return false;
		if (markerType == null) {
			if (other.markerType != null)
				return false;
		} else if (!markerType.equals(other.markerType))
			return false;
		return true;
	}

}
