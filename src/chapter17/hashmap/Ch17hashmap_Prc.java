package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Ch17hashmap_Prc {
	
	public static void main(String[] args) {
		
	//�л�����, ����
	Map<Student, Integer> map = new HashMap<Student,Integer>();
	
	
	//�ߺ�X
	map.put(new Student(1, "ȫ�浿"), 95);
	map.put(new Student(1, "ȫ�浿"), 95);
	map.put(new Student(2, "��μ�"), 80);
	map.put(new Student(3, "������"), 98);
	
	System.out.println("�� �ο�: "+map.size());		
	
	Set<Student> keyset = map.keySet();
	Iterator<Student> keysetIterator = keyset.iterator();
	while(keysetIterator.hasNext()) {
		Student key =keysetIterator.next();
		Integer value =map.get(key);
	}
	
	Scanner scan = new Scanner(System.in);
	Student std; //����
	int input;
	String name;
	
	while(true) {
		System.out.print("�л� ��ȣ");
		input=scan.nextInt();
		System.out.print("�л� �̸�");
		name=scan.next();
		std=new Student(input,name);
		
		
	}
	
		
	}

}
