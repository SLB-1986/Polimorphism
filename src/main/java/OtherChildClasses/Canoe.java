package OtherChildClasses;

import SuperClass.Interfaces.HumanActions;
import SuperClass.Interfaces.VehicleActions;

public class Canoe extends Boat implements VehicleActions, HumanActions {
	@Override
	public void is_Silent(){
		System.out.println("child class Canoe: You hear only the water and the wind.");
	}
	@Override
	public void makeNoise(){
		System.out.println("child class Canoe: Someone is screaming...");
	}

}
