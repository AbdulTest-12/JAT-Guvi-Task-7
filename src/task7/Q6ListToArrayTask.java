package task7;

import java.util.ArrayList;
import java.util.List;

public class Q6ListToArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a List of Strings
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Kewi");
        list.add("Orange");
        list.add("Mango");
        list.add("Avacado");
        
        System.out.println("The List is :" + list);

        // Convert List to Array
        String[] array = list.toArray(new String[0]);

        // Print the array
        System.out.println("The List Converted to Array:");
        for (String item : array) {
            System.out.println(item);
        }
	}

}
