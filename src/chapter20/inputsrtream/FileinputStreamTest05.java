package chapter20.inputsrtream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileinputStreamTest05 {

	public static void main(String[] args) {
		//true : ������ �����ϸ� �����Ͱ� �߰��� �����.
		try(FileOutputStream fos = new FileOutputStream("resource.txt", true);
			FileInputStream fis = new FileInputStream("resource.txt")) {
			fos.write(71);
			fos.write(72);
			fos.write(73);
			
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			System.out.print((char)fis.read()+" ");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
