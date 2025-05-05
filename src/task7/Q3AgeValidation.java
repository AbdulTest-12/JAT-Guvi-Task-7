package task7;

import java.util.Scanner;

//Custom Exception
class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
		super(message);
	}
}

public class Q3AgeValidation {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter your age: ");
			int age = scanner.nextInt();

			if (age < 18) {
				throw new InvalidAgeException("Error: Age must be 18 or older.");
			}

			System.out.println("Age is valid. Access granted.");
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		
		}
	}
}
