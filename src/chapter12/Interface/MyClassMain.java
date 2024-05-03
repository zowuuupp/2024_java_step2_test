package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		
		//X,Y,MyInterface ≈∏¿‘¿« ∞¥√º
		
		MyClass mClass = new MyClass();
		
		X xClass = mClass;
		xClass.x();
		System.out.println("------------------");
		Y yClass = mClass;
		yClass.y();
		System.out.println("------------------");
		MyInterface iClass = mClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();
		System.out.println("------------------");
		
	}

}
