package chapter21;

public class ThreadEx03 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(1);
		}
	}
	
	
	
}
