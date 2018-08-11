package week2.Day3.examples;

public class Bicycle {
	
int cadence=0;
int speed=0;
int gear=1;
static int direction=10;
static int direction1=10;

void changeCadence(int newvalue)
{
	cadence=newvalue;
}
void changeGear(int newvalue)
{
	gear=newvalue;
}

void speedup(int increment)
{
	speed=speed+increment;
}

void applyBreaks(int decrement)
{
	speed=speed-decrement;
}


public static void changeDirection(int increment)
{
	direction=direction+increment;
}


void printStates()
{
	System.out.println("Cadence:" +cadence +"Speed:" +speed +"Gear:" +gear +"Direction"+direction);
}
}
