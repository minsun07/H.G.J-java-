package sec01.exam04;

public class SuperSonicAirPlaneExample {

	public static void main(String[] args) {
		
		SupperSonicAirplane sa = new SupperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupperSonicAirplane.SUPERSONIC;
		sa.fly(); 
		sa.flyMode = SupperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		

	}

}
