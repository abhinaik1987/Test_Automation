package week2day1.examples;

public class ReverseInteger {

	public static void main(String[] args)
	{

int reverse=0;
reverse=RevNum(1234);
System.out.println("The reversed Number is: " +reverse);

	}

	public static int RevNum(int num)
	{
		int rev=0;
		while(num!=0)
		{
		rev=rev*10+num%10;
		num/=10;
		}
		return rev;
	}
}
