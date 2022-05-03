package vhcl;

public class AppVehicle {

	public static void main(String[] args) {
		Vehicle bike = new Bike();
		Bike bike_2 = new Bike();
		Vehicle car = new Car();
		Car car_2 = new Car();
		
		System.out.println(bike.Gas(25));
		System.out.println(bike.Gas(110));
		
		System.out.println("");
		
		System.out.println(bike.brakes(80));
		

	}

}
