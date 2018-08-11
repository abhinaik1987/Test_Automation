
public class Functions {

	public static void main(String[] args)
	
	{
	 //add(5,3);
	 //System.out.println("This is Main");
	 //int r=prod(5,5);
	 //System.out.println("The product of the 2 numbers is: " +r);
	 //int a=findsum(100);
	 //System.out.println("The sum of the numbers is:" +a);
	//System.out.println(Math.random()*100);
	generaterandomnumber(35);
	}
		
	public static void add(int a ,int b)
	{
	int result= 0;	
	result=	a+b;
	System.out.println("The result of the function is :" +result);
	}

	public static int prod(int a, int b)
	{
		int res=0;
		res =a*b;
		return res;
		
	}
	
	public static int findsum(int n)
	{
		int sum=0;
		for (int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

  public static void generaterandomnumber(int n)
  {
  
	  double d =Math.random()*100;
	  int num =(int)d;
	  if(num<=n)
	  {
		  System.out.println(" The number is between 1 and 35 :" +num);
      }
	  else
	  {
	   System.out.println(" The number is not between 1 and 35 :" +num);	  
	  }
	  


}

}

	


