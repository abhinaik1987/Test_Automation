package week2.Day3.examples;

public class BicycleDemo {

	public static void main(String[] args)
	{
		Bicycle bike1 =new Bicycle();
		Bicycle bike4 =new Bicycle();
		
		bike1.changeCadence(80);
		bike1.changeGear(2);
		bike1.speedup(10);
		bike1.changeDirection(5);
		bike1.printStates();
		
		
		bike4.changeCadence(90);
		bike4.changeGear(6);
		bike4.speedup(20);
		bike4.changeDirection(10);
		bike4.printStates();

	}

}
