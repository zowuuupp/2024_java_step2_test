package chapter20.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStream01 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//��ü����
		//FileOutputStream fos = new FileOutputStream("output1.txt");
		//�κ�����
		FileOutputStream fos = new FileOutputStream("output2.txt");
		
		
		try(fos) {
			byte[] bs=new byte[26];
			byte data=65;//A
			
			for(int i=0;i<bs.length;i++) {
				bs[i]=data;
				data++;
			}
			
			//fos.write(bs); //��ü����
			fos.write(bs,2,10); //�κ�����
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
	}
}


