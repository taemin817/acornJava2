package generic.printer;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinterPlastic p = new ThreeDPrinterPlastic();
		p.setMaterial(new Plastic());
		p.print();

		ThreeDPrinterPowder p2 = new ThreeDPrinterPowder();
		p2.setMaterial(new Powder());
		p2.print();
		
		G3dPrinter<Plastic> p3 = new G3dPrinter<>();
		p3.setMaterial(new Plastic());
		p3.print();
		
		G3dPrinter<Powder> p4 = new G3dPrinter<>();
		p4.setMaterial(new Powder());
		p4.print();
		
		G3dPrinter<Water> p5 = new G3dPrinter<>();
		p5.setMaterial(new Water());
		p5.print();
		
		G3dPrinter2<Plastic> p6 = new G3dPrinter2<>();
		p6.setMaterial(new Plastic());
		p6.print();
		
		G3dPrinter2<Powder> p7 = new G3dPrinter2<>();
		p7.setMaterial(new Powder());
		p7.print();

		//G3dPrinter2<Water> p8 = new G3dPrinter2<>();
		
	}

}
