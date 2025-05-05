package task7;

import java.io.File;
import java.util.Scanner;

public class Q4FileNotFoundException {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		
		// TODO Auto-generated method stub
		 File file = new File("data.txt");
		 
         Scanner scanner = new Scanner(file);

         System.out.println("File content:");
         while (scanner.hasNextLine()) {
             String line = scanner.nextLine();
             System.out.println(line);
         }

         scanner.close();
	}

}
