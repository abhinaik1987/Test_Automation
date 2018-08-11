package week3.day2.examples;

public class RegularExpression {

	public static void main(String[] args)
	{
	String s= "I lost my: Wallets";
	if(s.matches("I lost my:?\\s*\\w{4,7}"))
	{
     System.out.println("The line matches" +s);
	}

	String s2= "I lost my: car";
	if(s2.matches("I lost my:? (wallet|car|cell-phone|marbles)"))
	{
     System.out.println("The line matches" +s2);

	}
	}
	
}