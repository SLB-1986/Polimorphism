package ChildClasses;

import SuperClass.Abstract.Person;
import SuperClass.Interfaces.HumanActions;

public class Professor extends Person implements HumanActions {
	@Override
	public void eat(){
		System.out.println("This is a professor eating");
	}
	@Override
	public void drink(){
		System.out.println("This is a professor drinking");
	}
	@Override
	public void makeNoise(){
		System.out.println("The professor shouts and makes noise.");
	}
	public void teaching(){
		System.out.println("The professor is teaching.");
	}
}
