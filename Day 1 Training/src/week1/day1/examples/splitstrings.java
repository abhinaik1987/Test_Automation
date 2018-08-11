package week1.day1.examples;

public class splitstrings {

	public static void main(String[] args) {
	String[] s= splitstring("Welcome to-java.com-hello world");
	for(String s2:s)
	{
		System.out.println(s2);
	}
	}
	

	public static String[] splitstring(String s)
	{
		String[] splits =s.split("-");
		
		return splits;
		
		
	}
    }
