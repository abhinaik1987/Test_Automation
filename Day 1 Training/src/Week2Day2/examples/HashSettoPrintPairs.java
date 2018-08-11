package Week2Day2.examples;

import java.util.HashSet;

public class HashSettoPrintPairs
{

	public static void PrintPairsusingSet(int[] numbers ,int n)
	
	{
		if(numbers.length < 2){
            return;}
                
    HashSet<Integer> set = new HashSet<Integer>(numbers.length);
        
      //{2, 6, 5,7, 9, 11}
        //n=9
        //iteration1
        //value:2
        //target=9-2=7
        //set=2
        //iteration2
        //n=9
        //vaue:6
        //target=3
        //set=6
        //iteration3
        //n=9
        //value:5
        //target=4
        //set=5
        //n=9
        //value=7
        //target=2
        //
        
        for(int value : numbers){
            int target = n - value;
            
            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }
            else
            {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }	 	

		}
}


