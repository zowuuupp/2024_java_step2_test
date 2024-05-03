package chapter20.inputsrtream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamTest01 {
	
	public static void main(String[] args) {
		//���1
		/*
		try(FileInputStream fis = new FileInputStream("input.txt");) {
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		//���2(�ۿ� �����ϰ� �ȿ� ���� �Ҵ�)
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
