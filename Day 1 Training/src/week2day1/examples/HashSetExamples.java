package week2day1.examples;

import java.util.HashSet;

public class HashSetExamples {

	public static void main(String[] args) {
		HashSet<String>hset =new HashSet<String>();
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Oranges");
		hset.add("Fig");
		hset.add("Grapes");
		hset.add("Apple");
		hset.add("Mango");
		
		
		System.out.println("Elements of hashset are :" +hset);
		System.out.println(hset.contains("Mango"));
		System.out.println(hset.remove("Fig"));
		System.out.println("Elements of hashset are :" +hset);
		System.out.println(hset.size());
		
		
		
		

	}

}
