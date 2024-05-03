package chapter16.arraylist;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("박영도");
		list.add("이석준");
		list.add("이진건");
		list.add("송예림");
		list.add("최서희");
		list.add("임도영");
		
		System.out.println(list);
		
		System.out.println("list[0] : "+list.get(0));
		System.out.println("list[1] : "+list.get(1));
		
		
		
		
	}

}
