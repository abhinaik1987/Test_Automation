package Week2Day2.examples;

import java.util.Arrays;

public class AnagramCheck {

		  public static Boolean isAnagram(String word,String anagram){
			  
			  
			  if( (word!=null && !word.isEmpty()) &&(anagram!=null && !anagram.isEmpty())
					&& (word.length()==anagram.length())  ){
				 int index=0;
				 //word-mary
				 //anagram=army
				  for(char ch: word.toCharArray()){		       
					if(anagram.indexOf(ch)!=-1){
				    	      index=anagram.indexOf(ch);
				    	      //index=2
				    	      //index=0
				    	       anagram=anagram.substring(0,index)+anagram.substring(index+1);
				    	                // "ar"+"y";
				    	       
				    	      // "army"->"army".substring(0,2)=>"ar"+"y"
				    	       //"ary".substring(0,0)+"ary".subting(1)
				    	       //ry.suntring(0,1)+subtring(2)
				    	       
				    	       //y
				       }
					else{
						return false;
					}
				  }
				  
			  }
			  
			  return anagram.isEmpty();
			  
			  
	   }

		  public static boolean iAnagram(String word, String anagram){
			  
		        char[] charFromWord = word.toCharArray();
		        char[] charFromAnagram = anagram.toCharArray();       
		        Arrays.sort(charFromWord);
		        Arrays.sort(charFromAnagram);
		        return Arrays.equals(charFromWord, charFromAnagram);
		    }

	    public static boolean isAnagramStringBuilder(String first,String second){
	    	
	    	       char[] chars= first.toLowerCase().toCharArray();
	    	       StringBuilder sbf= new StringBuilder(second.toLowerCase());
	    	       for(char ch: chars) {
	    	    	   int index =sbf.indexOf(ch +""); //  to take more than 1 character
	    	    	   //mary
	    	    	   //army.
	    	    	   //ary
	    	    	   //ry
	    	    	   //
	    	    	   if(index!=-1){
	    	    		   
	    	    		   sbf.deleteCharAt(index);
	    	      	   }
	    	    	    	    	   
	    	       }
	    	       
	    	       return sbf.length()==0?true:false;
	    	       /*if(sbf.length()==0){
	    	    	   return true;
	    	    	   
	    	       }
	    	       else{
	    	    	   return false;
	    	       }*/
	    	       
	    }
	    

	}


