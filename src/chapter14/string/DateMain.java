package chapter14.string;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		String strNow1=now.toString(); //��ü(heap) => String Ÿ������ �ٲ㼭 ��Ÿ���� ��.
		System.out.println("---------Date---------");
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		//String strNow2=sdf.format(now);
		String strNow2=sdf.toString();//��ü�� �ּҸ� String���� ��ȯ
		System.out.println("-----SimpleDateFormat-----");
		System.out.println(strNow2);
		
		
		
		
		
	}

}
