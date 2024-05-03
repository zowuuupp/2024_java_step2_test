package chapter19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args){
		FileInputStream fis = null;
		
		//...
		//fis = new FileInputStream("a.txt"); //�ܺ� ���� �����ö��� �ִ� ���� ������ �Ű� �ؾ��Ѵ�. main �տ� throws FileNotFoundException�� ����� �ȴ�.
		
		//throws FileNotFoundException �� �ϴ��� try�� �ϴ��� 1������ ������ �ؾ��Ѵ�. ���� �Ŵ�. 
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally { //finally �ȿ� ���ͼ� try catch �� ����� �Ѵ�?
			try {
				fis.close();//�ڿ� �ݳ�(�̰� ������ ���� ��)
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
		
		
		
		
	}

}
