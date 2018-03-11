package by.ldy.hw5.ex01;

public class Main {

	public static void main(String[] args) {

		Pen pen = new Pen("Shneider", 32, 15, "Green", 0.5, "Blue");
		Pencil pencil = new Pencil("Eric Schrause", 18, 12, "Brown", 0.7, "BH");
		Marker marker = new Marker("Craftman", 51, 16, "Black", 1.0, "RED", "Permanent");
		Ruler ruler = new Ruler("ProudPrime", 40, 25, "Triangle");
		OfficerRuler ofRuler = new OfficerRuler("ProudPrimeVIP", 80, 40, "Rectangle", "TwentyCircles");
		SoftRubber sRubber = new SoftRubber("Braum", 23, "Cube", 12, "VerySoft");
		
		NewbieKit newbieKit = new NewbieKit();

		newbieKit.add(pen);
		newbieKit.add(pencil);
		newbieKit.add(marker);
		newbieKit.add(ruler);
		newbieKit.add(ofRuler);
		newbieKit.add(sRubber);
		
		newbieKit.showDetails();
	}

}
