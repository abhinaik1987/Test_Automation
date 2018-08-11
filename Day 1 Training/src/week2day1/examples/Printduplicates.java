package week2day1.examples;

public class Printduplicates {

	public static void main(String[] args)
	
	{
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
	printduplicate(names);
		
	}

	public static  String[] printduplicate(String s[])
	{
		for(int i=0;i<s.length-1;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
		     if(s[i]==s[j])
		     {
		    	 System.out.println("Duplicate Element : "+s[j]); 
		     }
			 }
		}
			
		
		return(s);
	}
}
