package week1.day1.examples;

public class Searchstring

{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
  int ind = Substring("My World is Hello World");
  System.out.println("The index is " +ind );
	}

	
	public static int Substring (String s)
	{ 
	 if (s.indexOf("Hello World")!=-1)	
	 {
		 return s.indexOf("Hello World");
	 }
	 
	 else 
		 return -1;
	 }
	}
