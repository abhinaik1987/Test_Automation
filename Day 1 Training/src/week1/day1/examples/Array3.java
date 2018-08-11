package week1.day1.examples;

public class Array3 {

	public static void main(String[] args)
	{
	 char[] CopyFrom = {'d','e','c','a','f','f','i','n','a','t','e','d'	};
	 char[] CopyTo =new char[10];
	 
	 for(int i=2;i<9;i++)
	 {
		 CopyTo[i]=CopyFrom[i];
      System.out.println(" The new Array is "  +CopyTo[i]);
	 }
}
}