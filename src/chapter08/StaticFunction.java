package chapter08;

public class StaticFunction {
	
	String str1="�Ϲ� ȸ������";
	static String str2="Static ȸ������";
	
	public static String getStatic() {
		//static �޼ҵ�� static������ ����� �����ϴ�.
		//str1="MEMBER"; (���� str1�� ���� ������ �ְ� ����� �������� �����̴�.)
		str2="VIP";
		return str2;
	}
	
	public void add() {
		System.out.println(1+2);
	}
	
	

}
