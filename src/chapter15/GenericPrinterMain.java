package chapter15;

public class GenericPrinterMain {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> printerPowder = new GenericPrinter<Powder>();
		printerPowder.setMaterial(new Powder());
		Powder powder = printerPowder.getMaterial(); // 다운 캐스팅을 할 필요가 없다.
		System.out.println(powder);
		powder.doprinting();
		
		System.out.println();
		
		GenericPrinter<Plastic> printerPlastic = new GenericPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial(); // 다운 캐스팅을 할 필요가 없다.
		System.out.println(plastic);
		plastic.doprinting();
		
		System.out.println();
		
		/*
		GenericPrinter<Water> printerWater = new GenericPrinter<Water>();
		printerWater.setMaterial(new Water());
		Water water = printerWater.getMaterial(); // 다운 캐스팅을 할 필요가 없다.
		System.out.println(water);
		water.doprinting();
		*/
		
		Water water = new Water();
		water.doprinting();
	}
	

}
