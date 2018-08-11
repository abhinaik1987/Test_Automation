package Week3Day1.examples;



	
public class MountainBike extends Bicycle
	{
	    
	    // the MountainBike subclass adds one field
	    int seatHeight;

	    public MountainBike()
	    {
	    	
	    }
	    // the MountainBike subclass has one constructor
	    public MountainBike(int startHeight,
	                        int startCadence,
	                        int startSpeed,
	                        int startGear) 
	    {
	        super(startCadence, startSpeed, startGear);
	        seatHeight = startHeight;
	    }   
	        
	    // the MountainBike subclass adds one method
	    public void setHeight(int newValue)
	    {
	        seatHeight = newValue;
	    }   

	    public void printStates()
	    {
	    	   super.printStates();
	    	   System.out.println("seatHeight:" +seatHeight);
	    }
	
}
