package week1.day1.examples;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[] =new int[10];
		for (int i=a.length-1;i>=0;i--) 
		{
			b[i]=a[i];
			System.out.println(" Reverse Array is " +b[i]);
	}
		
}
}