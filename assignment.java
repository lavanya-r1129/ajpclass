package day9;

class User {
	int id ;
	String name ; 
	
	// parameterized constructor
	public User (int id, String name) {
		this.id = id;
		this.name = "name";
	}
}
//employe inherits the useer
class Employee extends User {
	double salary; // monthly salary
	
	//constructor calls user constructor
	public Employee ( int id, String name,double salary) {
		super(id,name);
		this.salary = salary;
	}
	// calculate annual salary
	public double calculatesalary() {
		return salary * 12;
	}
	void display() {
		System.out.println("id: " + id);
		System.out.println("name: " + name);
		System.out.println("Salary: " + calculatesalary());	
	}
}

public class assignment {

	public static void main(String[] args) {
		//input
		int id = 101;
		String name = "shree";
		double salary = 15000;
	
	//creating employee object 
	Employee emp = new Employee(id,name,salary) ;
		
	//display()
	emp.display();
	
	}

}
