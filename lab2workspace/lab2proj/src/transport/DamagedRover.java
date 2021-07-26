package transport;

public class DamagedRover extends MarsRover {
	private final static int MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY = 10000;
	private final static int METERS_FROM_START_TO_CLIFF = 1000;
	private final static int N_SIMULATIONS = 500;	
	private double position;
	private double metersTraveled;
	private boolean fell;
	public void simulationStormDamageTravel()
	{
		while(metersTraveled < MAX_TRAVEL_METERS_BEFORE_EMPTY_BATTERY)
		{
			 double distanceNextTurn = (int)(1 + 4*Math.random());
			 boolean forwardNotBack = (Math.random() > 0.5);
			 if (forwardNotBack)
	            {
	                position = position + distanceNextTurn;
	            }
	            else
	            {
	                position = position - distanceNextTurn;
	            }
	                        
	            metersTraveled = metersTraveled + distanceNextTurn;
	            if(position > 1000 || position < -1000)
	            {
	            	fell = true;
	            	break;
	            }
		}
	}
	private double getMetersTraveled() {
		return metersTraveled;
	}
	private boolean getFell()
	{
		return fell;
	}
	public static void main(String[] args) {
		DamagedRover dr = new DamagedRover();
		dr.simulationStormDamageTravel();
		for(int i = 0; i <= N_SIMULATIONS; i++)
		{
		if(dr.fell)
		{
			System.out.println("fell");
			System.out.println(dr.metersTraveled);
		}
		else if(dr.metersTraveled >= 10000) {
			System.out.println("No more power");
		}
		}
		
	}
}

