package ChildClasses;

import SuperClass.Interfaces.HumanActions;
import SuperClass.Interfaces.VehicleActions;

public class LandVehicle extends Machine implements VehicleActions, HumanActions {
	@Override
	public void start() { System.out.println("child class LandVehicle: The car engine started."); }
	@Override
	public void isMoving(){
		System.out.println("child class LandVehicle: This car is moving.");
	}
	public void accident(){
		System.out.println("child class LandVehicle: The car had an accident.");
	}// own method
	@Override
	public void stop(){
		System.out.println("child class LandVehicle: The car engine is stopped.");
	}
	@Override
	public void makeNoise(){
		System.out.println("child class LandVehicle: To much noise from such a small car.");
	}

}
