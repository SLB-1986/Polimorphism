package ChildClasses;

import SuperClass.Abstract.Person;
import SuperClass.Interfaces.HumanActions;

public class Janitor extends Person implements HumanActions {
	@Override
	public void eat(){
		System.out.println("This is a janitor eating");
	}
	@Override
	public void drink(){
		System.out.println("This is a janitor drinking");
	}
	public void cleaning(){
		System.out.println("The janitor is cleaning.");
	}
}
