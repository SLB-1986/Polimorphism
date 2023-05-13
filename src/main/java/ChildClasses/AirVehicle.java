package ChildClasses;

import SuperClass.Interfaces.HumanActions;
import SuperClass.Interfaces.VehicleActions;

public class AirVehicle extends Machine implements VehicleActions, HumanActions {
	@Override
	public void start() { System.out.println("child class AirVehicle: The jet engines are creating a low frequency rumble."); }
	@Override
	public void isMoving(){
		System.out.println("child class AirVehicle: The plane moves and makes taxi.");
	}
	public void isFlying(){
		System.out.println("child class AirVehicle: The plane is in air.");
	} // own method
	@Override
	public void stop(){
		System.out.println("child class AirVehicle: The jet engines stopped.");
	}
	@Override
	public void makeNoise(){
		System.out.println("child class AirVehicle: It's active and is making noise.");
	}

}
