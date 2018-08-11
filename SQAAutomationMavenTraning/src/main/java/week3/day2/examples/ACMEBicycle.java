package week3.day2.examples;

public class ACMEBicycle implements BicycleInterface
{
 int cadence=0;
 int speed=0;
 int gear=1;
 
 
 public void changeCadence(int newValue)
 {
	 cadence =newValue;
 }
 public void changeGear(int newValue)
 {
	 gear =newValue;
 }
 
 public void speedUp(int increment)
 {
	 speed = speed+increment;
 }
 
 public void applyBrakes (int decrement)
 {
	 speed = speed-decrement;
 }
 
 public void printall()
 {
 System.out.println("Cadence:"  +cadence + "Gear:" +gear + "Speed:" +speed);
 }
 
 public static void main(String[] args)
 {
 ACMEBicycle bike =new ACMEBicycle();
 bike.changeCadence(10);
 bike.changeGear(5);
 bike.speedUp(10);
 bike.applyBrakes(5);
 bike.printall();
 }
}