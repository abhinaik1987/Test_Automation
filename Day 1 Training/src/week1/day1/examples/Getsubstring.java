package week1.day1.examples;

public class Getsubstring {

	public static void main(String[] args)
	{
		
       System.out.println(getsubstr("helloworld" ,3,7));
       System.out.println(getsubstr("helloworld" ,3));
	}
	
	public static String getsubstr(String s ,int start ,int end)
	{
		return s.substring(start, end);
	}

	public static String getsubstr(String s ,int start)
	{
		return s.substring(start);
	}



}





	
