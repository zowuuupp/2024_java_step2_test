package chapter12.Interface;

import java.util.Scanner;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		SmartTelevision st = new SmartTelevision();
		
		st.turnOn();
		System.out.print("TV ������ �Է����ּ��� : ");
		int vol = scan.nextInt();
		st.setVolume(vol);
		st.turnOff();
		st.search("www.naver.com");
		System.out.println("---------------------------");
		
		//Remote Ŭ������ ���� �Ǿ� �ִ� �޼ҵ带 �������̵��� �޼ҵ� ����
		Remote rc=st; // �ڽ�Ŭ������ ��ü�� �θ� Ŭ������ ��ü�� �������� ����ȯ
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
