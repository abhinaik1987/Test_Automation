package week1.day1.examples;

public class ReverseString {

	public static void main(String[] args) 
	{
	String result="";	
	String s1[] =splitstring("Hello World");
	for(int i=s1.length-1;i>=0;i--)
	{
	 result=result +s1[i] +" ";
	 
	}
	System.out.println(" Reverse of the String: " +result);
	}
	
	public static String[] splitstring(String s)
	{
		String[] splits =s.split("\\s");
		
		return splits;
		
		
	}
    }

	