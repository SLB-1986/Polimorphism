package SuperClass.Parent;

import java.util.Objects;

public class Human implements Comparable<Human>{
	private int weight;
	private String race;
	int happiness;
	private boolean isHungryAndThirsty;

	public Human(int weight, String race, int happiness) {
		this.weight = weight;
		this.race = race;
		this.happiness = happiness;
		this.isHungryAndThirsty = false;
	}

	public String getRace() {
		return race;
	}

	public Human() {
		this(0, null, 0);
	}

	public int getWeight() {
		return weight;
	}

	public void feed(int amountOfFoodAndWater) {
		if (amountOfFoodAndWater > 5) {
			System.out.println("The human cannot eat that much");
			return;
		}
		if (isHungryAndThirsty) {
			weight += (amountOfFoodAndWater / 2);
			modifyHappiness(1);
		} else {
			weight += amountOfFoodAndWater;
			modifyHappiness(-1);
		}
		if (weight >= 35) {
			isHungryAndThirsty = false;
		}
	}

	private void modifyHappiness(int amount) {
		happiness += amount;
		if (happiness >= 51) {
			happiness = 2;
			System.out.println("Are reasons to be happy.");
		}
		if (happiness <= 1) {
			happiness = 0;
			System.out.println("He's depressed.");
		}
	}

	/**
	 * the Human is happy if happiness is high enough and he is not fat
	 */
	public boolean isTheHumanHappy() {
		return happiness >= 100 && !isTheHumanFat();
	}

	public boolean isTheHumanFat() {
		return weight >= 80;
	}

	public void takeA_Walk() {
		modifyHappiness(3);
		weight -= 79;
		isHungryAndThirsty = true;
	}


	public String getTheHumanRace() {
		return race;
	}

	public void passTime() {
		weight -= 55;
		modifyHappiness(-2);
		if (weight <= 60) {
			isHungryAndThirsty = true;
		}
	}

	@Override
	public int compareTo(Human o) {
		if (weight > o.getWeight()) {
			return 1;
		} else if (weight < o.getWeight()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Human human = (Human) o;

		return  weight == human.weight &&
				happiness == human.happiness &&
				isHungryAndThirsty == human.isHungryAndThirsty &&
				race.equals(human.race);
	}

	@Override
	public int hashCode() {

		return Objects.hash(weight, race, happiness, isHungryAndThirsty);
	}

	@Override
	public String toString() {
		return "Human {" +
				"weight =" + weight +
				", race ='" + race + '\'' +
				" }\n";
	}
}
