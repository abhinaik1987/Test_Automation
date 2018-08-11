package week1.day1.examples;

import java.util.Scanner;

public class Searchindex {

	public static void main(String[] args) 
	{ int searchkey =34;
	int pos=0;
	
	    Scanner in =new Scanner(System.in);
		searchkey= in.nextInt();
	     System.out.println(" You entered " +searchkey);
	     int [] arr1 = {23,45,21,55,234,1,34,90};
	     
	     for (int i=0;i<arr1.length;i++)
	     {
	    	if(arr1[i] ==searchkey)
	    	{
	         pos=i;
	    	System.out.println("Index is "  +pos);
	    	
	    	}
	    	
	    	else
	    		System.out.println(" Index is -1 "  );	
	    }


	}

}
