package chapter09;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed+=1;
		System.out.println(speed);
	}
	
	public final void stop() {//�߿��� �Ŷ� �ٸ��� �����Ǳ� ������ �ʴ´�. final, ����� �ǳ� ������ �ȵȴ�.
		System.out.println("�ڵ����� ����ϴ�.");
		speed=0;
	}
	

}
