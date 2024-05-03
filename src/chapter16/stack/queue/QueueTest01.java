package chapter16.stack.queue;

import java.util.ArrayList;

class MyQueue{ // 스택처럼 막혀있는 구조가 아니고 뚫린 구조라서 1번~5번 쌓은것을 1번부터 뺄 수 있다.
	
	private ArrayList<String> arrayQueue=new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		
		int len=arrayQueue.size();
		
		if(len==0) {
			System.out.println("큐가 비어 잇습니다.");
			return null;
		}
		
		return(arrayQueue.remove(0));
	}
}


public class QueueTest01 {

	public static void main(String[] args) {
		
		MyQueue queue=new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		
		
		
	}

}
