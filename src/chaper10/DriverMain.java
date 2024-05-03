package chaper10;

public class DriverMain {

	public static void main(String[] args) {
		
		/*
		//버스
		Bus bd = new Bus();
		bd.run();
		
		//택시
		Taxi td = new Taxi();
		td.run();
		*/
		
		Driver driver=new Driver();
		driver.drive(new Bus());
		driver.drive(new Taxi());
		
		
		
		
		
	}

}
