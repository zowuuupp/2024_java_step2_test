package chapter08;

public class Company {
	//외우는 느낌으로 해도 괜찮다.
	//객체를 단 하나만 생성하는 클래스
	private static Company instance=new Company();
	
	//생성자(heap)
	public Company() {
		// TODO Auto-generated constructor stub
	}
	
	//singleton 객체 생성
	public static Company getInstance() {
		//예외처리 -> 생성된 객체가 없으면 객체 생성
		if(instance == null) {
			instance=new Company();
		}
		return instance;
	}
	
	
	
	
	

}
