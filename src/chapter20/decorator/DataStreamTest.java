package chapter20.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("data.txt");
				DataOutputStream dos=new DataOutputStream(fos) ) { //������Ÿ���� ������ ���鼭 �а� ���ڴ�. ������� ���� �׷� ����.
			
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("It's good");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//=================================================
		try(FileInputStream fis=new FileInputStream("data.txt");
				DataInputStream dis=new DataInputStream(fis) ) {
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}//main

}
