package ChildClasses;

import SuperClass.Abstract.Vehicle;

public class Machine extends Vehicle{
	public void start(){ System.out.println("child class Machine: Starting."); } // own method
	public void isMoving(){
		System.out.println("child class Machine: Is moving.");
	}// own method
	public void stop(){
		System.out.println("child class Machine: Stopped.");
	}// own method
	@Override
	public void is_Silent() {
		System.out.println("child class Machine: The machine is silent.");
	}
	@Override
	public void makeNoise() {
		System.out.println("class Machine: The machine make noises.");
	}
}
