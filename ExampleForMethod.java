package day8;

class Student{
	private String name;
	private int age;

         //setter method
       public void setData(String name,int age) {
    	   this.name = name;
    	   this.age = age;
       }
       //getter method
       public String getname() {
    	   return name;
    	   }
       public int getage() {
    	   return age;
    	   }
}

public class ExampleForMethod {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setData("XYZ", 21);
		System.out.println(s.getname());
		System.out.println(s.getage());

}
}
