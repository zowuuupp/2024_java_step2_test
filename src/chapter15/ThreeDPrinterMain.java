package chapter15;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
	
		//���1
		ThreeDPrinter printerPowder=new ThreeDPrinter();
		Powder p1= new Powder();
		printerPowder.setMaterial(p1); //Object ���� ����� ���͵� ȣȯ�� �����ϴ�.
		System.out.println(p1);
		
		
		//���2
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
