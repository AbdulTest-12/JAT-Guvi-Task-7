package task7;

public class Q2ArrayandStringIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayIndexOutofBound

		try
		{
			int[] numbers = {1, 2, 0, 3};


			System.out.println("Accessing 4th element: " + numbers[8]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds.");
		}

		//StringIndexOutofBound

		try 
		{
			String text = "Thank You";
			System.out.println("Character at position 10: " + text.charAt(10));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: String index is out of bounds.");
		}


	}
}
