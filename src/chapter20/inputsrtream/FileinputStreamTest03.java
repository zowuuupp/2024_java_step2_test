package chapter20.inputsrtream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStreamTest03 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input3.txt")) {
			
			byte[] bs= new byte[10];//byte는 한 글자씩, 버퍼로 활용.
			
			int i;
			//fis.read(bs) 는 FileInputStream 인스턴스인 fis 에서 바이트를 읽어서 배열 bs 에 저장합니다.
			//이 때 read() 메서드는 읽은 바이트 수를 반환합니다. 따라서 int i 에는 실제로 읽은 바이트 수가 저장됩니다.
			while((i=fis.read(bs)) !=-1) { //10개씩 담기 => 가베지값 출력(여기서는 Z 다음의 QRST)
				for(byte b : bs) {
					System.out.print((char)b+" ");
				}//10개씩 출력
				System.out.println(": "+i+"바이트 읽음");
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}//main

}
