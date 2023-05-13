package SuperClass.Enum;

public enum WaterVehicles {
	CANOE(2, 1), MOTOR_BOAT(15, 60), AIRCRAFT_CARRIER(25, 80), SPEED_BOAT(16, 200),
	CRUISE_SHIP(22,60), BATTLE_SHIP(23, 90), HOOVER_CARRIER(18, 160),
	SUBMARINE(24, 120), YACHT(21, 90), CARGO_SHIP(19, 40),
	FERRY(17, 45.5), TUG_BOAT(13, 33.565), SAIL_BOAT(12,30.3), SHIPYARD(20, 40.32),
	PIRATE_SHIP(14,160), FISHING_BOAT(11,40.23), WIND_SURFER(10,5.2),
	STEAM_BOAT(7, 45.5), BULK_CARRIER(8, 45.0), RAFT(6,44.4), OIL_TANKER(9,60.41),
	DINGY_SHIP(6, 24.456), KAYAK(3, 34.4), BOAT(4,60.23), JET_SKI(5,90.41), BUOY(1,1.1);
	public final int waterVehicleModel;

	WaterVehicles(int i, double speed) {// here i represents the index I gave to each input from my enum list
		this.waterVehicleModel = i;
	}

}
