package MainClass;

import SuperClass.Enum.Race;
import SuperClass.Parent.Human;

public class MainForHuman {
	public static void main(String[] args) {
		/**Assignments 2:
		 Write a class that represents an abstract person. Extend that class for particular types of people:
		 professor, student, janitor, security guard, each with job specific methods, and common methods that they override, in their specific way.

		 Considering that the basic database operations usually performed on a database are create, read, update, delete (CRUD):
		 Model an interface for database operations
		 Implement the interface in at least three different ways
		 By using a control structure and input provided by the console (using Scanner) use different implementations of the interface to perform different operations

		 Given a large body of text, implement a class with at least three methods that process the text in order to replace a given word with their reverse.
		 The methods will demonstrate overloading. The three methods of text processing that should be implemented are:
		 Using split (using an array and the ‘for’ control structure)
		 Using indexOf and substr (using the ‘while’ control structure)
		 Using replace and indexOf (using the ‘do - while’ control structure)
		 Note that the methods need to have different but semantically meaningful signatures.*/

		final Human dude = new Human(75, "caucasian", 80); // I call the Human parent class by appealing a constructor build in

		// calling the Enum
		Race race = Race.CAUCASIAN; // I call the Race enum and I appeal only the one data from it, the CAUCASIAN input
		if (race == Race.CAUCASIAN) {// as long as the race is an Enum as input Caucasian
			System.out.println("The Caucasian is called a racist."); // will print this line
		} else {// otherwise
			System.out.println("Dude!");// will print this line of code.
		}
		System.out.println();//empty space

		System.out.println("This human is: " + dude.getRace());
		dude.takeA_Walk(); // we send the human to walk...
		System.out.println("Feeding the human. This shall be fun...");
		dude.feed(30);
		System.out.println("Is the human happy? " + dude.isTheHumanHappy());

		while (!dude.isTheHumanFat()) {
			dude.feed(1);
			if (dude.isTheHumanFat() == dude.isTheHumanFat()) {
				break;
			}
			dude.takeA_Walk();
		}

		System.out.println("The human eat to get fat..." + dude.isTheHumanHappy());
		dude.passTime();
		dude.takeA_Walk();
		System.out.println("Is the human happy ? " + dude.isTheHumanHappy() + ". He's still fat? " + dude.isTheHumanFat());
	}
}
