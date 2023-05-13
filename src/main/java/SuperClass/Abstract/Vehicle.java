package SuperClass.Abstract;

public abstract class Vehicle {
	/** This abstract class organise what the other classes which extend this abstract class must have.
	 So in other words, in this way we are sure that all the other vehicles have the characteristics,
	 methods defined here, in the abstract class.
	 In an abstract class you can have a list of methods and the implementations for those too. */
	String type;
	float age;

	public void printType(){ // This is not defined as abstract, so it can use an implementation
		System.out.println("This is an abstract think of type: " + type + " of vehicle;" +
				"and have the number of " + age + " years.");
	}
	public abstract void is_Silent(); // This abstract method doesn't know what to do until is implemented in other classes
	public abstract void makeNoise(); // This abstract method doesn't know what to do until is implemented in other classes


}
