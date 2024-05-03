package chaper10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		
		SupersonicAirplane sa=new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC; //flymode=2;
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL; //flymode=1;
		sa.fly();
		sa.land();
		
		
		
	}

}
