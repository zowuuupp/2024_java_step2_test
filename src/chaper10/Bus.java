package chaper10;

public class Bus extends Vehicle{
	
	private int busNum=510;

	//510번 버스가 달립니다.
	@Override
	public void run() {
		System.out.println(busNum+"번 버스가 달립니다.");
	}
	
	
	

}
