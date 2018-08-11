package week3.day2.examples;

import java.util.ArrayList;
import java.util.List;

public class ValidateIPAddress {

	public static void main(String[] args)
	{
		List<String> input = new ArrayList<String>();
		input.add("123-45-6789");
		input.add("9876-5-4321");
		input.add("987-65-4321 (attack)");
		input.add("987-65-4321 ");
		input.add("192-83-7465");
		String IpAddress="123.32.121";


		for (String ssn : input) {
			if (ssn.matches("^(\\d{3}-?\\d{2}-?\\d{3})$")) 
			{
				System.out.println("Found good SSN: " + ssn);
			}
		}	
	if(IpAddress.matches("^(\\d{3}\\.\\d{2}\\.\\d{3})$"))
	{System.out.println("True");
	}
	else
		System.out.println("False");	
	}

}
