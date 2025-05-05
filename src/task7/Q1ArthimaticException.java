package task7;

import java.util.Scanner;

public class Q1ArthimaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        try {
            // Read the first integer
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Read the second integer
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
        	System.out.println("Error: Division by zero is not allowed.");
            
        }
   

	}

}
