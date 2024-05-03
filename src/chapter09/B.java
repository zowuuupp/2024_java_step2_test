package chapter09;

public class B {
	
	public void methodB() {
		A a = new A();
		a.field="value";
		a.methodA();
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.methodB();
		
		
		
		
	}
	
	
	
	
	

}
