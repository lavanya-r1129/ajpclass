package day5;

public class matrimony {

	public static void main(String[] args) {
		
		String gender="male";
		int age =19;
		if(gender =="male")
		{
			if(age>=21)
			{
				System.out.println("eligible for married");
			}
			else
			{
				System.out.println("Not eligible for married");
			}
			
		}
		else if(gender == "female")
		{
				if(age>=18)
				{
					System.out.println("eligible for married");
				}
				else
				{
					System.out.println("Not eligible for married");	
				}
			}
			else {
				System.out.println("invalid gender");
			}	
	}

}
