package OtherChildClasses;

import SuperClass.Abstract.Vehicle;
import SuperClass.Interfaces.VehicleActions;

public class Boat extends Vehicle implements VehicleActions {
	@Override
	public void is_Silent(){
		System.out.println("child class Boat:  Ssssth!");
	}
	@Override
	public void makeNoise(){
		System.out.println("child class Boat: Is a vigorous, lip-vibrating \"brrr\" sound, or \"put-put-put\".");
	}

}
