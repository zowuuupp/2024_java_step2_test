package chapter14.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		String strNow1=now.toString(); //객체(heap) => String 타입으로 바꿔서 나타내는 것.
		System.out.println("---------Date---------");
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//String strNow2=sdf.format(now);
		String strNow2=sdf.toString();//객체의 주소를 String으로 변환
		System.out.println("-----SimpleDateFormat-----");
		System.out.println(strNow2);
		
		
		
		
		
	}

}
