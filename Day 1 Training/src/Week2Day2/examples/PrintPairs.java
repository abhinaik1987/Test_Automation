package Week2Day2.examples;

import java.util.HashMap;
import java.util.Map;

public class PrintPairs {

		public static void main(String[] args) {        

		    int []a = {2, 6, 3, 9, 11};
		    printSumPairs(a,9);        

		}


		public static void printSumPairs(int []input, int k){
		    Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		    for(int i=0;i<input.length;i++){

		        if(pairs.containsKey(input[i]))
		            System.out.println(input[i] +", "+ pairs.get(input[i]));
		        else
		            pairs.put(k-input[i], input[i]);
		    }

		}
		
	}


