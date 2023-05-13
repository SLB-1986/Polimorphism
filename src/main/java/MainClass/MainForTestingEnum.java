package MainClass;

import ChildClasses.WaterVehicle;
import SuperClass.Enum.WaterVehicles;

public class MainForTestingEnum {
	public static void main(String[] args) {
		//I'm  using the enum
		System.out.println("I'm  using the enum, by calling it from the Enum through the child class WaterVehicle:");
		WaterVehicles wv1= WaterVehicles.BOAT;
		System.out.println("This is a " + wv1 + ".");
		WaterVehicles wv2= WaterVehicles.MOTOR_BOAT;
		System.out.println("This is a " + wv2 + ".");
		WaterVehicles wv3= WaterVehicles.AIRCRAFT_CARRIER;
		System.out.println("This is a " + wv3 + ".");
		System.out.println("------------");// delimitation

		// I'm using the enum as a member variable inside the WaterVehicle class
		System.out.println("I'm using the enum as a member variable inside the child WaterVehicle class:");
		WaterVehicle myBoat = new WaterVehicle(WaterVehicles.BOAT);
		System.out.println("And I call some of the methods, from Own methods and @Override methods");
		myBoat.start(); myBoat.makeNoise(); myBoat.isMoving(); myBoat.accident(); myBoat.stop();
		System.out.println("------------");// delimitation

		// still testing the enum
		System.out.println("still testing the enum:");
		System.out.println("Something is on the water! " + WaterVehicles.BOAT.waterVehicleModel);
		System.out.println("------------");// delimitation

		// listing the Enum WaterVehicles
		System.out.println("I call the entire list of Enum:");
		for (WaterVehicles waterVehicles : WaterVehicles.values()) { // I call upon the Enum WaterVehicles in order to iterate the vehicles
			System.out.print(waterVehicles + ", ");// which will be printed one after another.
		}
		System.out.println();//empty space
		System.out.println("------------");// delimitation
	}
}
