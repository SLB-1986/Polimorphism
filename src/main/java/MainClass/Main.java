package MainClass;

import ChildClasses.AirVehicle;
import ChildClasses.LandVehicle;
import ChildClasses.Machine;
import ChildClasses.WaterVehicle;
import OtherChildClasses.Boat;
import OtherChildClasses.Canoe;
import SuperClass.Enum.WaterVehicles;

public class Main {
	/** Assignments 1:
	Write classes that describe types of vehicles, starting from a base class and extending it
	Write at least two interfaces that reinforce specific behavior for any vehicle and make sure the classes you describe implement the interfaces
	Use the interfaces and the base class as types (polymorphism) and write a program that executes various actions on vehicle instances.*/

	public static void main(String args[]) {
		AirVehicle plane = new AirVehicle();/*I created a Vehicle of type AirVehicle, which I implemented below*/
		AirVehicle helicopterDrone = new AirVehicle();/*I created a Vehicle of type AirVehicle, which I implemented below*/

		WaterVehicle battleShip = new WaterVehicle(WaterVehicles.BATTLE_SHIP);/*I created a Vehicle of type WaterVehicle, which I implemented below*/
		WaterVehicle windBaseBoat = new WaterVehicle(WaterVehicles.WIND_SURFER);/*I created a Vehicle of type WaterVehicle, which I implemented below*/

		LandVehicle car = new LandVehicle();/*I created a Vehicle of type LandVehicle, which I implemented below*/
		LandVehicle eCar = new LandVehicle();/*I created a Vehicle of type LandVehicle, which I implemented below*/

		Boat motorBboat = new Boat();/*I created a Vehicle of type Boat, which I implemented below*/

		Machine rocket = new Machine();/*I created a Vehicle of type Machine, which I implemented below*/
		Machine spaceVehicle = new Machine();/*I created a Vehicle of type Machine, which I implemented below*/

		LandVehicle bicycle = new LandVehicle();/*I created a Vehicle of type LandVehicle, which I implemented below*/
		LandVehicle eBicycle = new LandVehicle();/*I created a Vehicle of type LandVehicle, which I implemented below*/

		Canoe canoe = new Canoe();/*I created a Vehicle of type Canoe, which I implemented below*/

		// implementations
		plane.start();//this plane is of type Vehicle from the AirVehicle class which implements the start action.
		plane.makeNoise();//this plane is of type Vehicle from the AirVehicle class which implements the makeNoise action.
		plane.isMoving();//this plane is of type Vehicle from the AirVehicle class which implements the isMoving action.
		plane.isFlying();//this plane is of type Vehicle from the AirVehicle class which implements the isFlying action.
		System.out.println("------------");// delimitation

		helicopterDrone.start();//this plane is of type Vehicle from the AirVehicle class which implements the start action.
		System.out.println("------------");// delimitation

		battleShip.start(); battleShip.accident(); battleShip.makeNoise(); battleShip.isMoving();
		System.out.println("------------");// delimitation

		motorBboat.start(); motorBboat.makeNoise(); motorBboat.isMoving();
		System.out.println("------------");// delimitation

		windBaseBoat.start(); windBaseBoat.isMoving(); windBaseBoat.makeNoise(); windBaseBoat.accident();
		System.out.println("------------");// delimitation

		car.start(); car.makeNoise(); car.isMoving(); car.accident();
		System.out.println("------------");// delimitation

		eCar.start(); eCar.is_Silent(); eCar.isMoving();
		System.out.println("------------");// delimitation

		rocket.start(); rocket.isMoving(); rocket.makeNoise();
		System.out.println("------------");// delimitation

		spaceVehicle.start(); spaceVehicle.isMoving();
		System.out.println("------------");// delimitation

		bicycle.start(); bicycle.is_Silent(); bicycle.isMoving();
		System.out.println("------------");// delimitation

		eBicycle.start(); eBicycle.isMoving(); eBicycle.is_Silent();
		System.out.println("------------");// delimitation

		eCar.is_Silent();
		System.out.println("------------");// delimitation

		eBicycle.is_Silent();
		System.out.println("------------");// delimitation

		canoe.start(); canoe.isMoving(); canoe.isMoving();
		System.out.println("------------");// delimitation

		// stop implementation
		plane.stop();System.out.println("------------");// delimitation
		helicopterDrone.stop();System.out.println("------------");// delimitation
		battleShip.stop();System.out.println("------------");// delimitation
		windBaseBoat.stop();System.out.println("------------");// delimitation
		car.stop();System.out.println("------------");// delimitation
		eCar.stop();System.out.println("------------");// delimitation
		rocket.stop();System.out.println("------------");// delimitation
		spaceVehicle.stop();System.out.println("------------");// delimitation
		bicycle.stop();System.out.println("------------");// delimitation
		eBicycle.stop();System.out.println("------------");// delimitation

	}
}
