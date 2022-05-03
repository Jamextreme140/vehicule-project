package vhcl;

public class Bike implements Vehicle{
	
	private int speed = 0;
	
	@Override
	public String brakes(int amount) {
		speed -= amount;
		return "The bike has stopped and is going " + speed + " km/h";
	}

	@Override
	public String Gas(int amount) {
		speed += amount;
		String msg = "The bike has accelerated and is going " + speed + " km/h";
		if(speed > MAX_S) 
			msg = "Excessive speed | " + msg;
		return msg;
	}
	
	public int Seat() {
		return 2;
	}

}
