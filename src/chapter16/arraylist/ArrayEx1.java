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
		
		//�ε����� �����ϴ� ������ �Ը� Ŀ���� ������ ���ϵȴ�. �� �������� �ذ��ϱ� ���� Iterator ����
		System.out.println("------------------------------------");
		//#1.List������ �ڿ��� �ݺ��ڷ� ��ȯ
		Iterator<Integer> it = list.iterator();
		
		//#2. �ݺ��ڸ� while���� �����Ͽ� ��� �����͸� �о��
		while(it.hasNext()) { // Ŀ���� �ϳ��� �о��. ���� �Ÿ� �ν��Ϸ� ���� ��� �ݺ��Ѵ�. �׷��� ������ �����. ��, iteratorȭ �Ǿ��־�� �Ѵ�. 
			int v=it.next(); //unBoxing �Ͽ� ��ü�� �⺻�ڷ������� ����.
			System.out.println(v);
			
		}
		
	}

}
