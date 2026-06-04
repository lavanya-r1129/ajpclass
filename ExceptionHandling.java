package Day11;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			//division by zero
			System.out.print("enter a number");;
			int num = sc.nextInt();
			System.out.print("Enter divisor : ");;
			int divisor = sc.nextInt();
			int result = num / divisor;
			System.out.println(result);
			
			//errearray index out of bounds
			int[] arr= {10,20,30,40,50};
			System.out.println("Enter array index:");
			int index = sc.nextInt();
			
			System.out.println(arr[index]);
			
		}catch(ArithmeticException e) {
			System.out.println("Error division by zero is not allowed.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds.");
		}

	}

}
