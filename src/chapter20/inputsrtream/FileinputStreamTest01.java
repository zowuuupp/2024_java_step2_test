package chapter20.inputsrtream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamTest01 {
	
	public static void main(String[] args) {
		//방법1
		/*
		try(FileInputStream fis = new FileInputStream("input.txt");) {
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//방법2(밖에 선언하고 안에 들어가서 할당)
		FileInputStream fis = null;
		
		try {
			fis=new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//finally
		
		System.out.println("end");
	}//main
	
	

}
