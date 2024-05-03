package chapter19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException1 {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
	//=======================================================
	public static void main(String[] args) {
		ThrowsException1 test = new ThrowsException1();
		
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch  (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) { //2���� ������ �ƴ� ��쵵 üũ.
			System.out.println(e);
		}
		System.out.println("end");
	}//main

}
