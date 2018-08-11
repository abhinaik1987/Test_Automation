
public class TwoDimensional_Array

{

	public static void main(String[] args) 
	
	{

  String x[][]=new String[3][4];
  x[0][0]="A";
  x[0][1]="B";
  x[0][2]="C";
  x[0][3]="D";
  x[1][0]="E";
  x[1][1]="F";
  x[1][2]="G";
  x[1][3]="H";
  x[2][0]="I";
  x[2][1]="J";
  x[2][2]="K";
  x[2][3]="M";
  
  
  
  //Rows
  
  System.out.println("Rows are " +x.length);
  
  //Columns
  
  System.out.println("Cols are " +x[0].length);
  
  int rows =x.length;
  int cols =x[0].length;
  
  for (int i=0;i<rows;i++)
  {
 for (int j=0;j<cols;j++)
 {
	 System.out.print(x[i][j] +" --");
 }
 
 System.out.println();
  }

	
	
	}	
}
