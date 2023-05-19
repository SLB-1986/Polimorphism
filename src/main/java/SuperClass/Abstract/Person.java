package SuperClass.Abstract;

public abstract class Person {
	/**Assignments 2:
	 Write a class that represents an abstract person. Extend that class for particular types of people:
	 professor, student, janitor, security guard, each with job specific methods, and common methods that they override, in their specific way.

	 Considering that the basic database operations usually performed on a database are create, read, update, delete (CRUD):
	 Model an interface for database operations
	 Implement the interface in at least three different ways
	 By using a control structure and input provided by the console (using Scanner) use different
	 implementations of the interface to perform different operations

	 Given a large body of text, implement a class with at least three methods that process the text in order to replace a given
	 word with their reverse. The methods will demonstrate overloading. The three methods of text processing that should be implemented are:
	 Using split (using an array and the ‘for’ control structure)
	 Using indexOf and substr (using the ‘while’ control structure)
	 Using replace and indexOf (using the ‘do - while’ control structure)
	 Note that the methods need to have different but semantically meaningful signatures.*/
	String name, surname, title;
	int socialIdentificationNumber;
	float height, kg;
	double wage;

	public abstract void eat(); // own method
	public abstract void drink();// own method

}
