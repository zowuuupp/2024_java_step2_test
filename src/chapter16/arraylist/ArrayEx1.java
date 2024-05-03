package chapter16.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		// Collection => List => ArrayList

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println("list.size(): " + list.size());

		list.add(10);
		list.add(1000);
		list.add(20000);
		System.out.println("list.size(): " + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + " : " + list.get(i));
		}
		
		//인덱스로 접근하는 구조는 규모가 커지면 성능이 저하된다. 그 문제점을 해결하기 위해 Iterator 도입
		System.out.println("------------------------------------");
		//#1.List구조의 자원을 반복자로 변환
		Iterator<Integer> it = list.iterator();
		
		//#2. 반복자를 while으로 수행하여 모든 데이터를 읽어옴
		while(it.hasNext()) { // 커서가 하나씩 읽어간다. 다음 거를 인식하러 가고 계속 반복한다. 그러다 없으면 멈춘다. 단, iterator화 되어있어야 한다. 
			int v=it.next(); //unBoxing 하여 객체를 기본자료형으로 변경.
			System.out.println(v);
			
		}
		
	}

}
