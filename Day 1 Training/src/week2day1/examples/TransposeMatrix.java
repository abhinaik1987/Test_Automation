package week2day1.examples;

public class TransposeMatrix
{
public static void main()
{
	
}
	
	
	
	public static int[][] transpose(int arr[][])
	{
		
		int arr1[][] = {{1,2,3},
                         {4,5,6},
                         {7,8,9}};

System.out.println("The Original matrix is:" +arr1);
	    int m = arr.length;
	    int n = arr[0].length;
	    int ret[][] = new int[n][m];

	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            ret[j][i] = arr[i][j];
	        }
	    }

	    return ret;
	}

}
