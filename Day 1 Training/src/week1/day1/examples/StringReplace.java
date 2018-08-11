package week1.day1.examples;

public class StringReplace {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    
    String str ="Hello World";
    System.out.println(str.replace('H','W'));
    System.out.println(str.replaceFirst("H", "Wa"));
    System.out.println(str.replaceAll("He", "Ha"));
	}

}
