package chapter09;

public class SportCar extends Car{//������ �ִٰ� �ؼ� ��� �� �޴°� �ƴϴ�.
	
	@Override
	public void speedUp() {
		speed+=10;
		System.out.println("speed: "+speed);
	}
	
	/*
	//@Override�� �Ұ����� �޼ҵ�
	public void stop() {
		System.out.println("������ī�� ����ϴ�.");
		speed=0;
	}
	*/
	
	//���� �޼ҵ�
	public static void main(String[] args) {
		SportCar sc=new SportCar();
		sc.speedUp();
		sc.stop(); //�������̵带 ������ �� �θ𲨴� ��� �����ϴ�.
		
		
		
		
		
		
	}

	

}
