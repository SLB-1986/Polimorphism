package ChildClasses;

import SuperClass.Abstract.Person;
import SuperClass.Interfaces.HumanActions;

public class SecurityGuard extends Person implements HumanActions {
	@Override
	public void eat(){
		System.out.println("This is a security guard eating");
	}
	@Override
	public void drink(){
		System.out.println("This is a security guard drinking");
	}
	public void checking(){
		System.out.println("The security guard is checking around...");
	}

}
