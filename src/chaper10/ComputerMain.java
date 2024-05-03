package chaper10;

public class ComputerMain {

	public static void main(String[] args) {
		
		int r=10;
		Calculator calculator = new Calculator();
		System.out.println("¿øÀÇ ³ĞÀÌ : "+ calculator.areaCircle(r));
		
		System.out.println();
		Computer computer = new Computer();
		System.out.println("¿øÀÇ ³ĞÀÌ : "+ computer.areaCircle(r));
		
		
		
	}

}
