package chapter14.string;

import java.util.Date;

public class ToStringMain {

	public static void main(String[] args) {
		
		Object obj1=new Object();
		//재정의가 안 되어 있는 기본 toString
		System.out.println("---재정의가 안 되어 있는 기본 toString---");
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println("---재정의가 되어 있는 기본 toString---");
		Date obj2=new Date(); //이미 시,분,초 가 들어가있는 거다.
		System.out.println(obj2);
		
		
		
		
		
		
		
		
	}

}
