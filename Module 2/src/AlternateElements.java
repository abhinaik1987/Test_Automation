
public class AlternateElements {

	public static void main(String[] args)
	
	{
		String str[]= new String[] {"Welcome"};  //note change 
	       for (int i=0; i<str[0].length(); i+=2){  //note change 2
	           System.out.print(str[0].charAt(i));
		}	

	}

}
