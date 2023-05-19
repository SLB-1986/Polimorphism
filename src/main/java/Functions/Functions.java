package Functions;

public class Functions {

	private static int exaustedLevel = 5;
	private static int energyLevel = 100;
	private static int fuelLevel = 50;
	private int distance;
	private int fuelUsed;
	private static boolean timeToEat;
	private static boolean timeToRecharge;
	private static boolean timeToRefill;

	private static void mySubstring(){

	}

	/**feed the human*/
	private static void humanEnergyAction(boolean hungryAndThirsty, int amountOfFoodAndWater){
//		int exaustenLevel = 5; // as is defined above as: private static int - is not necessary to have it here as well
		if(hungryAndThirsty){
			timeToEat = true;
			while (amountOfFoodAndWater > 0){
				int eatingAndDrinking = 2;
				exaustedLevel = exaustedLevel - eatingAndDrinking;
				amountOfFoodAndWater = amountOfFoodAndWater - eatingAndDrinking;
			}
		}
		System.out.println("Is time to eat and drink something! " + amountOfFoodAndWater);
	}
	/**recharge the battery*/
	private static void electricEnergyAction(boolean lowBattery, int loadedEnergy){
//		int energyLevel = 100;// as is defined above as: private static int - is not necessary to have it here as well
		if(lowBattery){
			timeToRecharge = true;
			while (loadedEnergy > 0){
				int percentageRecharged = 2;
				energyLevel = energyLevel - percentageRecharged;
				loadedEnergy = loadedEnergy - percentageRecharged;
			}
		}
		System.out.println("Is time to recharge the battery. " + loadedEnergy);
	}
	/**refill with fuel*/
	public static void functions(boolean refuel){// by using the: distance, fuelUsed; I can check if is necessary to refuel,
		// if I don't use the combustion engine, electric engine of human energy action methods
	}
	private static void combustionEngineAction(boolean lowFuel, int refillFuel){
//		int fuelLevel = 50;// as is defined above as: private static int - is not necessary to have it here as well
		if(lowFuel){
			timeToRefill = true;
			System.out.println();
			while (refillFuel > 0){
				int quantityRefilled = 2;
				fuelLevel = fuelLevel - quantityRefilled;
				refillFuel = refillFuel - quantityRefilled;
			}
		}
		System.out.println("Is time to refill with fuel! " + refillFuel);
	}
	public void indexOf(int caracter, int i){// with this method i can check a certain char from a certain index identified with "i" here
		indexOf(caracter, 0);
	}

	private static void checkType(boolean check) {// with this method I check the type between any things from my code lines.
		if(check){
			System.out.println("something.");
		}else {
			System.out.println("something else.");
		}
	}
}
