package MainClass;

import ChildClasses.Janitor;
import ChildClasses.Professor;
import ChildClasses.SecurityGuard;
import ChildClasses.Student;

import java.util.Scanner;

public class MainPerson {
	public static void main(String[] args) {

		System.out.println("Type your sentence"); // requesting to insert a sentence

		Scanner sc = new Scanner(System.in); // i use the scanner in order to use the input given by the user
		String input = sc.nextLine(); // input represents what's typed by the user

		String[] strings = input.split(" "); // this array of String called strings represents the input split by a space
		Janitor janitor = new Janitor();
		Professor professor = new Professor();
		SecurityGuard securityGuard = new SecurityGuard();
		Student student = new Student();

		for (int i = 0; i < strings.length; i++) { // using the for i loop in order to iterate through the array of String named strings
			/*for (int i = strings.length - 1; x >= 0; x--){ // decrementing, from the last word to the first*/
			System.out.println(strings[i] + " "); // as long as the input is by incrementation, where i represents each word in a String array named strings
		}

		try {
			String letter = "a"; // i've created a String letter for type "a"
			/* If the letter "a" is changed to a name, or something else that will be searched for and shown how many times it repeats */
			int letterSize = letter.length(); // int letterSize is equal the length of the String letter of type "a"
			int lengthOfStrings = strings.length; // i give to the strings length an int to be countable

			int j = 0; // int j represents the index j which is equal to zero;
			do { // do index j by incrementation
				System.out.println(j);
				j++; //by incrementation of index j
			}while (j < lengthOfStrings);{// as long as while the lengthOfStrings, which represents the String array of strings,
			int length = strings[j].length(); // as long the length of strings j is iterating
			String mySubString = strings[j].substring(length - letterSize);// and, mySubString String represents the substring array of strings by index j
			if (mySubString.equals(letter)) { // and so, if my substring equals the String letter (here named "a")
				System.out.println(strings[j]); // will return the array of String strings in index j
//				j++; //by incrementation of index j
			}
		}
		}
			catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
				System.out.println("Some error has occurred.");
		}finally {
			System.out.println("My try->catch process is done.");
		}
		System.out.println("--------------------------");
		System.out.println(input);// print the given input
		System.out.println("--------------------------");
		professor.eat();
		professor.drink();
		professor.teaching();
		professor.makeNoise();
		System.out.println("--------------------------");
		janitor.cleaning();
		janitor.fiziology();
		janitor.drink();
		System.out.println("--------------------------");
		student.eat();
		student.drink();
		student.studying();
		student.sleep();
		System.out.println("--------------------------");
		securityGuard.makeNoise();
		securityGuard.checking();
		securityGuard.drink();
		securityGuard.sleep();

	}
}
