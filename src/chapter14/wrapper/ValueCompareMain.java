package chapter14.wrapper;

public class ValueCompareMain {

	public static void main(String[] args) {
		
		System.out.println("[-128 ~ 128 �ʰ����� ���]"); //1byte=8bit
		Integer obj1=300; //4����Ʈ => 32��Ʈ
		Integer obj2=300;
		
		//�ּҸ� ��
		System.out.println("==��� : "+(obj1==obj2)); //�ܺ� (��, �ּҴ� �ٸ���)
		System.out.println("==��ڽ����� ��� : "+(obj1.intValue()==obj2.intValue()));//����(Ŭ�������� ����� �ڽ��� ����� ��� �����ϸ� �ȴ�)
		
		//============================================================================
		System.out.println("[-128 ~ 128 �������� ���]"); //1byte=8bit
		Integer obj3=100; //4����Ʈ => 32��Ʈ
		Integer obj4=100;
		//�ּҸ� ��
		System.out.println("==��� : "+(obj3==obj4)); //�ܺ�
		System.out.println("==��ڽ����� ��� : "+(obj3.intValue()==obj4.intValue()));//����
		System.out.println("==equals ��� : "+obj3.equals(obj4));//�ܺη� �����Ͽ� ���α��� , �̷� ��� ������ equals�� ���� ����.
		
		
		
		
		
	}

}
