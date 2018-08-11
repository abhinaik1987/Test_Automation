import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadArrayintoFileExample 
{

public static void main(String[] args) throws IOException
	
	{
	 BufferedReader inputstream =null;
	 PrintWriter outputstream =null;
	 
	 try
	 {
		 inputstream= new BufferedReader(new FileReader("src/main/resources/Example.txt"));
		 outputstream = new PrintWriter(new FileWriter("src/main/resources/output.txt"));
	 String l;
	 
	 while((l= inputstream.readLine())!=null)
			 {
		 
		 outputstream.println(l);
			 }
	 }catch (FileNotFoundException e)
	 {
		 e.printStackTrace();
	 }
	 finally
	{
     if (inputstream!=null)	
     {
    inputstream.close();	 
     }
     if (outputstream!=null)	
     {
    outputstream.close();	 
     }
	}
	 
	 
FileReader(inputstream,outputstream);	 
	}


public static void FileReader(BufferedReader I,PrintWriter O) throws IOException
{
 String l;
 while((l= I.readLine())!=null)
 { 
	 String a[]=l.split(",");
	 
 }
 }
	
}		