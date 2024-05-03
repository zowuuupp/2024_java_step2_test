package chapter15;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
	
		//방법1
		ThreeDPrinter printerPowder=new ThreeDPrinter();
		Powder p1= new Powder();
		printerPowder.setMaterial(p1); //Object 여서 어느게 들어와도 호환이 가능하다.
		System.out.println(p1);
		
		
		//방법2
		Powder p2=(Powder)printerPowder.getMaterial();
		System.out.println(p2);
	
		
		ThreeDPrinter printerPlastic=new ThreeDPrinter();
		Plastic t1=new Plastic();
		printerPlastic.setMaterial(t1);
		System.out.println(t1);
		
		Plastic t2=(Plastic)printerPlastic.getMaterial();
		System.out.println(t2);
		
	}

}
