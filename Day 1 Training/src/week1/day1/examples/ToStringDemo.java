package week1.day1.examples;

public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=845.48;
		String s =Double.toString(d);
		int dot =s.indexOf('.');
		System.out.println(dot   + " digits " + " Before decimal point ");
		System.out.println((s.length()-dot-1)  + " digits " + " After decimal point ");
	}

}
