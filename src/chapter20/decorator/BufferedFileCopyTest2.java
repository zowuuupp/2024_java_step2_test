package chapter20.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopyTest2 {
	
	public static void main(String[] args) {
		long millisecond=0;
		
		try(FileInputStream fis = new FileInputStream("a.zip"); 
				FileOutputStream fos= new FileOutputStream("copy2.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos); ) {//Buffered�� ���� �ӵ��� ��������.
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i=bis.read()) != -1){
				bos.write(i);
				
			}
			millisecond = System.currentTimeMillis()-millisecond;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("���� ���� �ϴ� �� "+millisecond+" millisecond�� �ҿ�Ǿ����ϴ�.");
		//43574
		
	}//main

}
