package day4;

public class MarksValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Marks = 80;
		if (Marks >=80 && Marks <=100)
				{
			System.out.println("distinction");
				}
		else if (Marks >= 60 && Marks <= 59)
				{
			System.out.println("First class");
				}
		else if (Marks >= 35 && Marks <= 34) 
				{
			System.out.println("Second class");
				}
		else {
			System.out.println("Fail");	
		}
	}

}
