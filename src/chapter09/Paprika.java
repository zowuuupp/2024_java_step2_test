package chapter09;

public class Paprika extends Vegetable{
	
	/*
    String sort;
	String season;
	String super.name;
	�̰� �̹� �����մ�.
	*/
	
	private String color;
	private int price;
	private String name;
	
	//�⺻ ������
	public Paprika() {
		// TODO Auto-generated constructor stub
	}
	
	//setter
	public void Set2(String a, int b, String c) {
		color=a; // a�� �Է��� �ϹǷ� ���� this �� �ʿ� ����.
		price=b;
		name=c;
	}
	
	public void Disp1() {
		System.out.println("=====paprika=====");
		System.out.println("�з� : "+sort);
		System.out.println("���� : "+season);
		//��������� �θ�κ��� ��ӹ��� �Ͱ� ��ġ�ϴ� ���� ���� ��� 
		//�θ�Ŭ������ �⺻ ������(super)�� �̿��Ͽ� �����Ѵ�.
		System.out.println("�̸� : "+super.name);//���⼭ �� ���忡���� super�� �Ѵܰ� �� �θ��� Vegetable�̴�.
		System.out.println();
	}
	
	public void Disp2() {
		System.out.println("=====paprika=====");
		System.out.println("���� : "+color);
		System.out.println("���� : "+price);
		System.out.println("�̸� : "+name);
		System.out.println();
	}
	
	
	
	
	

}
