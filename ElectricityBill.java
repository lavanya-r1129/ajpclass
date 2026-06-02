package day7;

public class ElectricityBill {
	public static double calculateBill(int units) {

	double bill=0;
	
	if (units<=100) {
		bill=units*1.50;
	}
	else if (units <=200) {
		bill=100*1.50+(units-100)*2.50;
	}
	else {
		bill = 100 * 1.50 + 100 * 2.50 + (units - 200);
	}
	return bill;
	}

	public static void main(String[] args) {
	        int units=350;
	        
	        double totalBill = calculateBill(units);
	        System.out.printf("Total Bill Amount: Rs %.2f\n", totalBill);
	        
	        System.out.println("Test 75 units: " + calculateBill(75));   
	        System.out.println("Test 150 units: " + calculateBill(150)); 
	        System.out.println("Test 350 units: " + calculateBill(350));  
	}

}
