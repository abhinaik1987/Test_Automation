package week1.day1.examples;

public class Quiz {

	public static void main(String[] args) 
	
	{
     int n=24;
     if ((n%2==1)|| (n%2==0)&& (n<=6 && n<=20))
     {
    System.out.println("Wierd");	 
	 }
     else if((n%2==0)&& ((n<=2 && n<=5)||(n>20)))
     {
    System.out.println(" Not Wierd ");	 
     }
}
}