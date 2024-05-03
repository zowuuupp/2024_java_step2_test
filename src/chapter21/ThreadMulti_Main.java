package chapter21;

public class ThreadMulti_Main {

	public static void main(String[] args) {
		//Multi Thread
		
		ThreadEx03 t3= new ThreadEx03();
		ThreadEx03_2 t3_2= new ThreadEx03_2();
		
		t3.start();
		t3_2.start();

	}

}
