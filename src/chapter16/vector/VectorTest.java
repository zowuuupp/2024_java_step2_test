package chapter16.vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		Object obj;
		//ũ�� 1�� �迭����
		Vector<Object> vec = new Vector<Object>(1);
		
		obj=20240219;
		vec.addElement(obj);
		System.out.println("�뷮�� #1: "+vec.capacity());
		//vector�� ����Ǿ� �ִ� ������Ʈ ��
		System.out.println("ũ��� #1: "+vec.size());
		System.out.println();
		
		obj="some people";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮�� #2: "+vec.capacity());
		//vector�� ����Ǿ� �ִ� ������Ʈ ��
		System.out.println("ũ��� #2: "+vec.size());
		System.out.println();
		
		obj="dream of  success";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮�� #3 : "+vec.capacity());
		//vector ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ��� #3 : "+vec.size());
		System.out.println();
		
		obj="while";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮�� #4 : "+vec.capacity());
		//vector ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ��� #4 : "+vec.size());
		System.out.println();
		
		obj="other people";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮�� #5 : "+vec.capacity());
		//vector ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ��� #5 : "+vec.size());
		System.out.println();
		
		obj="get up";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮�� #5 : "+vec.capacity());
		//vector ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ��� #6 : "+vec.size());
		System.out.println();
		
		obj="evety morning";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮�� #5 : "+vec.capacity());
		//vector ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ��� #7 : "+vec.size());
		System.out.println();
		
		obj="and make";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮�� #5 : "+vec.capacity());
		//vector ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ��� #8 : "+vec.size());
		System.out.println();
		
		obj="it happen";
		vec.addElement(obj); //������Ʈ �߰�
		System.out.println("�뷮�� #6 : "+vec.capacity());
		//vector ����Ǿ� �ִ� ������Ʈ�� ��
		System.out.println("ũ��� #9 : "+vec.size());
		
		System.out.println(vec);
		
		
	}

}
