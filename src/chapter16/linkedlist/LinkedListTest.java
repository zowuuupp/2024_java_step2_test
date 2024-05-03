package chapter16.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		//Ư�� ��ü�� �߰�, ����, ã���� �� Arraylist���� ������ ����.
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
