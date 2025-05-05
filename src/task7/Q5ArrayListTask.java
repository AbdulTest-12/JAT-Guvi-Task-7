package task7;

import java.util.ArrayList;

public class Q5ArrayListTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<String>();
		
		//Adding the elements
		System.out.println("Thia are the fruits added below");
		
		fruits.add("Mango");
		fruits.add("Kewi");
		fruits.add("Avacado");
		fruits.add("Watermelon");
		fruits.add("Apple");
		fruits.add("Orange");
		
		System.out.println(fruits);
		
		//Removing all the elements
		
		fruits.clear();
		System.out.println("After removing all the fruits: " + fruits);

	}

}
