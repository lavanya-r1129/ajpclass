package day10;
//superclass
class Hillstation {
	void location() {
		System.out.println("Location is:");
	}
	void famousfor() {
		System.out.println("Famous for:");
	}
}
//sub class1
class Manali extends Hillstation {
	
	void location() {
		System.out.println("Manali is in himachal Pradesh");
	}

	void famousfor() {
		System.out.println("It is famous for Hadimba Temple and adventure sports");
	}
}
//subclass2
class Mussoorie extends Hillstation {
	
	void location() {
		System.out.println("Mussoorieis in Uttarkhand");
	}
	
	void famousfor() {
		System.out.println("It is famous for Education institution");
	}
}
//subclass3
class Gulmarg extends Hillstation {
	
	void location() {
		System.out.println("Gulmarg is in Jammu and kashmir");
	}
	
	void famousfor() {
		System.out.println("It is famous for Skiing");
	}
}
//main class
public class StateExample {

	public static void main(String[] args) 	{
		
		Hillstation hs=new Hillstation();
		Manali m = new Manali();
		Mussoorie mu = new Mussoorie();
		Gulmarg g= new Gulmarg();
		
		m.location();
		m.famousfor();
		
		mu.location();
		mu.famousfor();
		
		g.location();
		g.famousfor();
		System.out.println();
	}
}
