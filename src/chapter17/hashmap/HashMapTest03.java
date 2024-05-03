package chapter17.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest03 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner scan= new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���!");
			System.out.print("���̵� : ");
			String id=scan.next(); //Spring
			System.out.println();
			
			if(map.containsKey(id)) {//�Է��� ���̵��� ���� ����
				System.out.print("��й�ȣ�� �Է��ϼ���!");
				String pw=scan.next();//123
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� ����");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					continue;
				}//inner if
			}else {
				System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�.");
			}//out if
		}//while
		
	}

}
