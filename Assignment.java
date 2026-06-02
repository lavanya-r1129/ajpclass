package day8;

class Bank{
	//instance variable
	double amount;
	
	//constructor
	public Bank(double amount) {
		this.amount=amount;
	}
	//withdraw method
	public void withdraw(double withdrawalamount) {
		String message=(withdrawalamount <= amount)
				?"withdrawalsuccessful"
						:"insufficient balance";
		System.out.println(message);
		if (withdrawalamount <= amount) {
			amount-=withdrawalamount;
		}
	}
	//deposit amount
	public void deposit(double depositamount) {
		amount+=depositamount;
	}
	//display balance
	public void display() {
		System.out.println("available balance:" + amount);
	}
}

public class Assignment {

	public static void main(String[] args) {
		//initial amount
		Bank b =new Bank(10000);
		//withdraw
		b.withdraw(5000);
		//deposit
		b.deposit(5000);
		//display
		b.display();
	}

}
