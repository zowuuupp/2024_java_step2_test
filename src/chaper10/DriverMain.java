package chaper10;

public class DriverMain {

	public static void main(String[] args) {
		
		/*
		//����
		Bus bd = new Bus();
		bd.run();
		
		//�ý�
		Taxi td = new Taxi();
		td.run();
		*/
		
		Driver driver=new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		
		
		
		
	}

}
