package day9;
abstract class Bird 
{
	abstract void eat();
	abstract void fly();
}
abstract class Egale extends Bird 
{ 
	void fly () 
	{
		
	}
	
}
final class SerpentEgale extends Egale
{
	final void eat()
	{
		System.out.println("serpent egale hunts over mountains nad eats: ");
	}
	/*void fly() {
		System.out.println("serpent egale flies at greatest heights" );
	}*/
}
public class Abstraction {
	
	final int a = 100;

	public static void main(String[] args) {
		
	}

}
