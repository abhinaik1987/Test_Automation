package Week2Day2.examples;

public class Anagram {

	static boolean isanagram=false;
	public static void main(String[] args)
	
	{
		
		Anagram anagram = new Anagram();
        System.out.println(anagram.CheckAnagram("marys","armys"));
		
	}

	
	public static boolean CheckAnagram(String a,String b)
	{
		if(a.length()!=b.length())
		{
		return isanagram;
		}
		for (int i=0;i<a.length();i++)
		{
		 char a1=a.charAt(i);
		 char b1 =b.charAt(i);
		 
		 if(a1==b1)
		 {
		 isanagram=true;	 
		 }
		 }
	
	return isanagram;
	}
	

}