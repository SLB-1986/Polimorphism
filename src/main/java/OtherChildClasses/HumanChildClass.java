package OtherChildClasses;

import SuperClass.Interfaces.HumanActions;
import SuperClass.Parent.Human;

public class HumanChildClass extends Human implements HumanActions {

	private static final String HumanRace = String.valueOf(SuperClass.Enum.Race.ASIAN);

	@Override
	public boolean isTheHumanHappy() {
		return super.isTheHumanHappy();
	}
	@Override
	public void eat(){
		System.out.println("child class HumanChildClass: The human is eating.");
	}
	@Override
	public void drink(){
		System.out.println("child class HumanChildClass: The human is drinking.");
	}
	@Override
	public void makeNoise(){
		System.out.println("child class HumanChildClass: The human is active, so noise is made.");
	}
	@Override
	public void fiziology(){ System.out.println("child class HumanChildClass: The human eats or drink, or it's something else."); }
	@Override
	public void sleep(){
		System.out.println("child class HumanChildClass: The human is sleeping.");
	}
}
