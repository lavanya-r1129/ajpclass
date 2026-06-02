package day10;

import java.util.Scanner;
interface calculator {
	void add();
	void sub();
}
class Mycalculator1 implements calculator {
	public void add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println(c);
		}
	public void sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
		}
	}
class Mycalculator2 implements calculator {
	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st number: ");
		int a=scan.nextInt();
		System.out.println("enter 2nd number: ");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println(c);
	}
	public void sub() {
		Scanner scan= new Scanner (System.in);
		System.out.println("enter 1st number: ");
		int a=scan.nextInt();
		System.out.println("enter 2nd number: ");
		int b=scan.nextInt();
		int c=a-b;
		System.out.println(c);
	}
}
public class ExampleInterface {

	public static void main(String[] args) {
		Mycalculator1 c1= new Mycalculator1();
		Mycalculator2 c2= new Mycalculator2();
		c1.add();
		c1.sub();
		c2.add();
		c2.sub();
	}

}
