package task7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Q7TreeMapTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		TreeMap<Integer, String> employee = new TreeMap<Integer, String>();
		
		employee.put(1001, "Subash");
		employee.put(1002, "Amar");
		employee.put(1003, "Zoya");
		employee.put(1004, "Arshiya Mehnoor");
		employee.put(1005, "Naruto Uzumaki");
		employee.put(1006, "Natasa Ramanoff");
		employee.put(1007, "Abu");
		employee.put(1008, "Maaveeran");
		employee.put(1009, "Edgar");
		employee.put(1010, "Hinata");
		
		   //sort the names in alphabetical order
		
		  List<String> names = new ArrayList<>(employee.values());
	        Collections.sort(names);

	        // Print names in alphabetical order
	        System.out.println("Employee names in alphabetical order:");
	        for (String name : names)
	        {
	            System.out.println(name);
	        }
	        
	}
}
