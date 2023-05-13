package SuperClass.Interfaces;

import SuperClass.Abstract.Vehicle;

public interface VehicleActions {
	/** In the interface we can not implement a method.
	 * This is possible in an abstract class, but not in an interface!*/
	/** Every method in an interface is abstract by default. So is not necessary to call it abstract. */

	default void start() {
		System.out.println("Interface Vehicle Action Started.");
	} // own method
	default void isMoving(){
		System.out.println("Interface Vehicle Action It moved.");
	} // own method
	default void stop(){
		System.out.println("Interface Vehicle Action Stopped.");
	}// own method
}
