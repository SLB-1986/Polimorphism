package ChildClasses;

import SuperClass.Enum.WaterVehicles;
import SuperClass.Interfaces.HumanActions;
import SuperClass.Interfaces.VehicleActions;

public class WaterVehicle extends Machine implements VehicleActions, HumanActions {

	private WaterVehicles waterVehicles;

	public WaterVehicle(WaterVehicles waterVehicles) {
		super();
	}

	public WaterVehicles getWaterVehicles() {
		return waterVehicles;
	}

	public void setWaterVehicles(WaterVehicles waterVehicles) {
		this.waterVehicles = waterVehicles;
	}

	@Override
	public String toString() {
		return "WaterVehicle{" +
				"waterVehicles=" + waterVehicles +
				'}';
	}


	@Override
	public void start() { System.out.println("child class WaterVehicle: The boat engine started.");}
	@Override
	public void isMoving(){
		System.out.println("child class WaterVehicle: This boat is moving.");
	}
	public void accident(){
		System.out.println("child class WaterVehicle: That boat had an accident and has sank.");
	} // own method
	@Override
	public void stop(){
		System.out.println("child class WaterVehicle: The boat engine is stopped.");
	}
	@Override
	public void makeNoise(){
		System.out.println("child class WaterVehicle: The boat is not very noisy.");
	}

}
