package chapter12.Interface;

import java.util.Scanner;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		SmartTelevision st = new SmartTelevision();
		
		st.turnOn();
		System.out.print("TV 볼륨을 입력해주세요 : ");
		int vol = scan.nextInt();
		st.setVolume(vol);
		st.turnOff();
		st.search("www.naver.com");
		System.out.println("---------------------------");
		
		//Remote 클래스의 정의 되어 있는 메소드를 오버라이딩된 메소드 대입
		Remote rc=st; // 자식클래스의 객체가 부모 클래스의 객체로 묵시적인 형변환
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		//rc.search("www.naver.com");
		System.out.println("---------------------------");
		
		Searchable sc=st;
		/*
		sc.turnOn();
		sc.setVolume(-5);
		sc.turnOff();
		*/
		sc.search("www.soldesk.com");
		
		
		
		
	}

}
