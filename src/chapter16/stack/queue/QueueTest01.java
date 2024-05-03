package chapter16.stack.queue;

import java.util.ArrayList;

class MyQueue{ // ����ó�� �����ִ� ������ �ƴϰ� �ո� ������ 1��~5�� �������� 1������ �� �� �ִ�.
	
	private ArrayList<String> arrayQueue=new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	public String deQueue() {
		
		int len=arrayQueue.size();
		
		if(len==0) {
			System.out.println("ť�� ��� �ս��ϴ�.");
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
