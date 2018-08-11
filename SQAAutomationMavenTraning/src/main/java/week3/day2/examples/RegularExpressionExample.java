package week3.day2.examples;

import java.util.ArrayList;
import java.util.List;

public class RegularExpressionExample {

	public static void main(String[] args)
	
	{
		List<String> input = new ArrayList<String>();
		input.add("Julia");
		input.add("Samantha");
		input.add("Samantha_21");
		input.add("Samantha?21 ");
		
		for (String ssn : input) {
			if (ssn.matches("^([a-zA-Z]\\w{8,30})$")) 
			{
				System.out.println("Username is correct: " + ssn);
			}
			else
			{
				System.out.println("Username is incorrect: " + ssn);	
			}

	}

}
}