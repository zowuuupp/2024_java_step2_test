package chapter09;

public class SportCar extends Car{//메인이 있다고 해서 상속 못 받는거 아니다.
	
	@Override
	public void speedUp() {
		speed+=10;
		System.out.println("speed: "+speed);
	}
	
	/*
	//@Override가 불가능한 메소드
	public void stop() {
		System.out.println("스포츠카가 멈춥니다.");
		speed=0;
	}
	*/
	
	//메인 메소드
	public static void main(String[] args) {
		SportCar sc=new SportCar();
		sc.speedUp();
		sc.stop(); //오버라이드를 막았을 뿐 부모꺼는 사용 가능하다.
		
		
		
		
		
		
	}

	

}
