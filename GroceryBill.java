package day7;

public class GroceryBill {
	 public static void calculateFinalBill(String itemName, int quantity, double price, int isMember) {
	       
	        double subtotal = quantity * price;
	        double discount = (isMember == 1) ? subtotal * 0.10 : 0;
	        double amountAfterDiscount = subtotal - discount;
	        double gstRate = (amountAfterDiscount > 500) ? 0.05 : 0.12;
	        double gst = amountAfterDiscount * gstRate;
	        double finalTotal = amountAfterDiscount + gst;
	        System.out.println("Item: " + itemName);
	        System.out.printf("Subtotal: %.2f\n", subtotal);
	        System.out.printf("Discount: %.2f\n", discount);
	        System.out.printf("GST Amount: %.2f\n", gst);
	        System.out.printf("Final Total: %.2f\n", finalTotal);
	        System.out.println("----------------------");
	    }
	public static void main(String[] args) {
		String itemName = "Rice";
		int quantity = 10;
		double price = 60.0;
		int isMember = 1; 
		calculateFinalBill(itemName, quantity, price, isMember);
		System.out.println("Test Case 2:");
		calculateFinalBill("Sugar", 3, 50, 0); 
		System.out.println("Test Case 3:");
		calculateFinalBill("Oil", 5, 150, 1); 
	}
}
		
