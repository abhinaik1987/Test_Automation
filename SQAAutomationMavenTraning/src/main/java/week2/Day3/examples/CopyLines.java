package week2.Day3.examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLines {

	public static void main(String[] args) throws IOException
	
	
	{
	 BufferedReader inputstream =null;
	 PrintWriter outputstream =null;
	 
	 try
	 {
		 inputstream= new BufferedReader(new FileReader("src/main/resources/xanadu.txt"));
		 outputstream = new PrintWriter(new FileWriter("src/main/resources/characteroutput.txt"));
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
	 

	}

}
