package chapter16.stack.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageMain {

	public static void main(String[] args) {
		Queue<Message> messageQueue=new LinkedList<Message>();
		
		//offer : �Է�
		messageQueue.offer(new Message("sendMail","ȫ�浿"));
		messageQueue.offer(new Message("sendSMS","������"));
		messageQueue.offer(new Message("sendKakaotalk","�̼���"));
		
		//poll : ���
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail" : 
				System.out.println(message.to+"�Կ��� ������ �����Դϴ�.");
				break;
			case "sendSMS" : 
				System.out.println(message.to+"�Կ��� SMS�� �����ϴ�.");
				break;
			case "sendKakaotalk" : 
				System.out.println(message.to+"�Կ��� īī������ �����ϴ�.");
				break;
			}
			
		}
		
	}

}
