package chapter19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args){
		FileInputStream fis = null;
		
		//...
		//fis = new FileInputStream("a.txt"); //외부 파일 가져올때는 있던 말던 무조건 신고를 해야한다. main 앞에 throws FileNotFoundException를 만들면 된다.
		
		//throws FileNotFoundException 를 하던지 try를 하던지 1가지를 무조건 해야한다. 같은 거다. 
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally { //finally 안에 들어와서 try catch 를 해줘야 한다?
			try {
				fis.close();//자원 반납(이거 때문에 많이 씀)
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("end");
		
		
		
		
	}

}
