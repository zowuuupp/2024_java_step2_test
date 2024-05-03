package chapter20.inputsrtream;

import java.io.FileReader;
import java.io.IOException;

public class FileinputStreamTest02 {
	
	public static void main(String[] args) {
		//�ѱ۱���
		//FileInputStream fis = null;
		FileReader fis=null;
		
		try {
			//fis=new FileInputStream("input2.txt");
			fis=new FileReader("input2.txt");
			
			int i;
			//fis.read() : ������ ������ ������ -1�� ��ȯ�ȴ�.
			while((i=fis.read()) != -1) {
				System.out.print((char)i+" ");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				System.out.println(e2);
			}
		}//finally
		System.out.println();
		System.out.println("end");
	}//main
	
	

}
