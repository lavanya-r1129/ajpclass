package day10;

class Plane {
	void takeoff() {
		System.out.println("plane taking off");		
	}
	void fly() {
		System.out.println("plane flying");		
	}
	void land() {
		System.out.println("plane is landing");		
	}
}
class CargoPlane extends Plane {
	void fly() {
		System.out.println("cqargo plane is flying at low height");		
	}
	void carrycargo() {
		System.out.println("cargo plane carries cargo");	
	}
}
class PassengerPlane extends Plane {
	void fly() {
		System.out.println("Passenger plane is flying at medium heights");	
	}
	void carrypassenger() {
		System.out.println("passenger carries passengers");	
	}
}
class FighterPlane extends Plane {
	void fly() {
		System.out.println("Fighterplane is flying at great heights");
	}
	void carryweapons () {
		System.out.println("fighterplane is carrying wepons");	
	}
}


public class demo {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.carrycargo();
		
		PassengerPlane pp = new PassengerPlane();
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carrypassenger();
		
		FighterPlane fp = new FighterPlane();
		fp.takeoff();
		fp.fly();
		fp.land();
		fp.carryweapons();
		

	}

}
