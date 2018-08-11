package Week2Day2.examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeated 
{
	
		 public static void main (String[] args) 
		   {
		       String s = "swiss";
		       Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		       char c[] = s.toCharArray();
		 
		       for (char ch : c) {
		           if (map.containsKey(ch)) {
		               int count = map.get(ch);
		               map.put(ch, count + 1);
		           } else {
		               map.put(ch, 1);
		       }
		   }
		 
		       for (char ch : c) {
		           if (map.get(ch) == 1) {
		              System.out.println("First non repeated characted in String \""
		              + s + "\" is:" + ch);
		              break;
		           }
		       }
		    }
		}
	

