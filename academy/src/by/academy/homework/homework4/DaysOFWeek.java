package by.academy.homework.homework4;

public enum DaysOFWeek {
	
	MONDAY, TUESDAY, WENDSDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	
	public static DaysOFWeek getByOrdinal(int value) {
		for(DaysOFWeek day: DaysOFWeek.values()){
			if (day.ordinal() == value) {
				return day;
			}
		}
		return null;
	}
}
