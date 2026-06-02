package day10;
//superclass
class Animal {
	void sound() {
		System.out.println("The animal makes a sound");
	}
}
//subclass
class Dog extends Animal {
	void sound() {
		System.out.println("The dog Barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("The cat meows");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Animal a=new Animal();
		Dog d= new Dog();
		Cat c= new Cat();
		a.sound();// calls animal method
		d.sound();// calls overriden dog method
		c.sound();// calls overriden cat method
	}

}
