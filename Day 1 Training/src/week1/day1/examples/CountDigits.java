package week1.day1.examples;

public class CountDigits {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    double d =143.23;
    String s1=Double.toString(d);
    String[] s2=splitstring(s1);
    for(String s3:s2) 
    {
     System.out.println("First Digits before and after decimal :" +s3.length());
     
	}

	}
	public static String[] splitstring(String s)
	{
		String[] splits =s.split("\\.");
		return splits;
	}
}
