package JavaPgms;

import java.util.List;
import java.util.ArrayList;

public class FizzBuzzPgm {

	public static List<String> fizzBuzzMethod(int[] num1){
		
		
		List<String> myList = new ArrayList<>();
		for(int i = 0;i<num1.length;i++){
			if(num1[i]%3 == 0 && num1[i]%5 == 0){
				System.out.println("Fizz and Buzz");
				myList.add("Fizz and Buzz");
						
			}
			else if (num1[i]%5 == 0){
				System.out.println("Buzz");
				myList.add("Buzz");
			}
			else if (num1[i]%3 == 0){
				System.out.println("Fizz");
				myList.add("Fizz");
			}
		}
		
		return myList;
		

	}

}
