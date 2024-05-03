package chapter16.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		//특정 객체를 추가, 삭제, 찾기할 때 Arraylist보다 성능이 좋다.
		LinkedList<String> mylist=new LinkedList<String>();
		
		mylist.add("A");
		mylist.add("B");
		mylist.add("C");
		
		System.out.println(mylist);
		
		System.out.println("-----------");
		mylist.add(1, "D");
		System.out.println(mylist);

		System.out.println("-----------");
		mylist.addFirst("0");
		System.out.println(mylist);
		
		System.out.println("-----------");
		System.out.println(mylist.removeLast());
		System.out.println(mylist);
		
		System.out.println("-----------");
		mylist.addLast("G");
		System.out.println(mylist);
		
		
	}

}
