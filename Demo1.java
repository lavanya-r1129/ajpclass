package day10;

class Heart{
	int weight ;
	int bpm;
	 
	Heart(int weight, int bpm){
		this.weight=weight;
		this.bpm=bpm;
	}
	int getweight() {
		return weight;
	}
	int getbpm() {
		return bpm;
	}
}
class Brain {
	int weight ;
	String colour;
	
	Brain(int weight, String colour){
		this.weight=weight;
		this.colour=colour;
	}
	int getweight() {
		return weight;
	}
	String getcolour() {
		return colour;
	}
}
class Bike {
	String Brand;
	int voltage;
	
	Bike(String Brand, int voltage){
		this.Brand=Brand;
		this.voltage=voltage;
	}
	String getBrand() {
		return Brand;
	}
	int getvoltage() {
		return voltage;
	}
}
class Book{
	String name ;
	String author;
	
	Book(String name, String author){
		this.name=name;
		this.author=author;
	}
	String getname() {
		return name;
	}
	String getauthor() {
		return author;
	}
}
class Student{
	Brain br=new Brain(25, "black");
	void hasA (Book b) {
		System.out.println(b.getname());
		System.out.println(b.getauthor());
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Bike bi =new Bike("hero Hond",120);
		Student s=new Student();
		
		System.out.println(s.br.getweight());
		System.out.println(s.br.getcolour());
		
	}

}
