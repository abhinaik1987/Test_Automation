package week1.day1.examples;

import java.util.Scanner;

public class NewClass {

	public static void main(String[] args)
	{
     int a=0;
     int b=2;
     int n=10;
     double sum=0;
     
     Scanner in =new Scanner(System.in);
     a= in.nextInt();
     System.out.println(" You entered " +a);
     b= in.nextInt();
     System.out.println(" You entered " +b);
     n= in.nextInt();
     System.out.println(" You entered " +n);
     
     for (int i=0;i<n;i++)
     {
    
        sum= a+ Math.pow(2, n)*b;
     }
     
     System.out.println(" Sum is "+ sum);
     

	}

}
