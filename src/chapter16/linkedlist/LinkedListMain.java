package chapter16.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

	public static void main(String[] args) {
		
		ArrayList<String> list1 =new  ArrayList<String>();
		List<String> list2 =new  LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list1.add(0,String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("ArrayList에 저장 되는 데 소요되는 시간: "+(endTime-startTime)+"ns");
		System.out.println("------------------------------------");
		
		startTime=System.nanoTime();
		for(int i=0;i<10000;i++) {
			list2.add(0,String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("LinkedList에 저장 되는 데 소요되는 시간: "+(endTime-startTime)+"ns");
		
		
		
		
		
	}

}
