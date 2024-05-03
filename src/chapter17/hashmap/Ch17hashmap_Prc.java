package chapter17.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Ch17hashmap_Prc {
	
	public static void main(String[] args) {
		
	//학생정보, 점수
	Map<Student, Integer> map = new HashMap<Student,Integer>();
	
	
	//중복X
	map.put(new Student(1, "홍길동"), 95);
	map.put(new Student(1, "홍길동"), 95);
	map.put(new Student(2, "김민선"), 80);
	map.put(new Student(3, "서주희"), 98);
	
	System.out.println("총 인원: "+map.size());		
	
	Set<Student> keyset = map.keySet();
	Iterator<Student> keysetIterator = keyset.iterator();
	while(keysetIterator.hasNext()) {
		Student key =keysetIterator.next();
		Integer value =map.get(key);
	}
	
	Scanner scan = new Scanner(System.in);
	Student std; //선언
	int input;
	String name;
	
	while(true) {
		System.out.print("학생 번호");
		input=scan.nextInt();
		System.out.print("학생 이름");
		name=scan.next();
		std=new Student(input,name);
		
		
	}
	
		
	}

}
