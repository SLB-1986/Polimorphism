package SuperClass.Enum;

public enum Race {
		CAUCASIAN(1),
		AFRICAN(6),
		ASIAN(4),
		ARABIAN(3),
		INDIAN(5),
		HISPANIC(2);
		public final int humanRace;
		Race (int humanRace){
			this.humanRace = humanRace;
		}
}
