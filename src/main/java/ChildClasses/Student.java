package ChildClasses;

import SuperClass.Abstract.Person;
import SuperClass.Interfaces.HumanActions;

public class Student extends Person implements HumanActions {
	@Override
	public void eat(){
		System.out.println("This is a student eating");
	}
	@Override
	public void drink(){
		System.out.println("This is a student drinking");
	}
	public void studying(){
		System.out.println("The student is reading.");
	}
}
