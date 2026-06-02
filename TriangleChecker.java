package day7;

public class TriangleChecker {
	
	 public static void checkTriangle(int a, int b, int c) {
	        if (a + b <= c || a + c <= b || b + c <= a) {
	            System.out.println("Invalid triangle");
	            return;
	        }
	        System.out.println("Valid triangle");
	        if (a == b && b == c) {
	            System.out.println("Type: Equilateral");
	        } else if (a == b || b == c || a == c) {
	            System.out.println("Type: Isosceles");
	        } else {
	            System.out.println("Type: Scalene");
	        }
	        int max = a;
	        int side1 = b;
	        int side2 = c;
	        if (b > max) {
	            max = b;
	            side1 = a;
	            side2 = c;
	        }
	        if (c > max) {
	            max = c;
	            side1 = a;
	            side2 = b;
	        }
	        if (side1*side1 + side2*side2 == max*max) {
	            System.out.println("Right Triangle: Yes");
	        } else {
	            System.out.println("Right Triangle: No");
	        }
	        System.out.println("----------------------");
	    }

	public static void main(String[] args) {
		System.out.println("Input: 3, 4, 5");
		checkTriangle(3, 4, 5); 
		System.out.println("Input: 5, 5, 5");
		checkTriangle(5, 5, 5); 
		System.out.println("Input: 1, 2, 10");
		checkTriangle(1, 2, 10); 
		    }
		}



