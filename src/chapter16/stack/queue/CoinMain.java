package chapter16.stack.queue;

import java.util.Stack;

public class CoinMain {

	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<Coin>();
		
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		
		System.out.println(!coinBox.isEmpty());//������� �ʾ�
		while(!coinBox.isEmpty()) {
			
			Coin coin = coinBox.pop();
			System.out.println("������ ����: "+coin.getValue());
		}
		
	}

}
