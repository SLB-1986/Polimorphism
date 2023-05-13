package SuperClass.Interfaces;

import SuperClass.Abstract.Person;

public interface HumanActions {
	/** In the interface we can not implement a method.
	 * This is possible in an abstract class, but not in an interface!*/
	/** Every method in an interface is abstract by default. So is not necessary to call it abstract. */

	default void eat(){
		System.out.println("interface HumanActions: Eating.");
	} // own method
	default void drink(){
		System.out.println("interface HumanActions: Drinking.");
	}// own method
	default void makeNoise(){ System.out.println("interface HumanActions: It's active and is making noise."); }// own method
	default void fiziology(){System.out.println("interface HumanActions Eat or drank too much, or it's something else."); } // own method
	default void sleep(){
		System.out.println("interface HumanActions Sleeping.");
	} // own method
	default void teaching(){
		System.out.println("");
	}
}
