package chapter20.inputsrtream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamTest03 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input3.txt")) {
			
			byte[] bs= new byte[10];//byte�� �� ���ھ�, ���۷� Ȱ��.
			
			int i;
			//fis.read(bs) �� FileInputStream �ν��Ͻ��� fis ���� ����Ʈ�� �о �迭 bs �� �����մϴ�.
			//�� �� read() �޼���� ���� ����Ʈ ���� ��ȯ�մϴ�. ���� int i ���� ������ ���� ����Ʈ ���� ����˴ϴ�.
			while((i=fis.read(bs)) !=-1) { //10���� ��� => �������� ���(���⼭�� Z ������ QRST)
				for(byte b : bs) {
					System.out.print((char)b+" ");
				}//10���� ���
				System.out.println(": "+i+"����Ʈ ����");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}//main

}
