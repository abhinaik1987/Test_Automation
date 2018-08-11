
public class Arrays
{

	public static void main(String[] args)
	{
		//Arrays starting index is 0
	String str[] =new String[5];
	str[0]= "Abhishek";
	str[1]= "Naik";
	str[2]= "Vinod";
	str[3]= "Missy";
	str[4]= "Naik-Castillo";
	
	
	//Length of the Array
	System.out.println(str.length);
	System.out.println("The length of the string is "+str.length);
	
	for (int i=0;i<str.length;i++)
	{
	System.out.println(str[i]);
	}
	
	}
}
