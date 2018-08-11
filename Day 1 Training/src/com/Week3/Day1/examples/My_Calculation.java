package com.Week3.Day1.examples;

public class My_Calculation extends Calculation 
{
	int num1;
	int num2;
	int z3;

public My_Calculation()
{
	
}
public My_Calculation(int v1 ,int v2)
{
	this.num1=v1;
	this.num2=v2;
}

public int multiplication (int x,int y)
{
	z3= x*y;
	return z3;
}

void printall()
{
super.printall();
System.out.println("Product of 2 numbers is :" +z3);	
}
	
	public static void main(String[] args)
	{
		My_Calculation cal =new My_Calculation();
		cal.Addition(20, 10);
		cal.Subtraction(20, 10);
		cal.multiplication(20, 10);
		cal.printall();

	}

}
