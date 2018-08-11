package Week3Day1.examples;

public class BicycleDemo {

	public static void main(String[] args)
	{
		Bicycle bike1 =new Bicycle();
		Bicycle bike4 =new Bicycle();
		MountainBike mbike =new MountainBike();
		MountainBike mbike1 =new MountainBike(5,20,10,8);
		
		mbike.speedup(20);
		mbike.applyBreaks(10);
		mbike.setHeight(20);
		mbike.printStates();
		
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
