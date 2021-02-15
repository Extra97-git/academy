package by.academy.classwork.lesson10;

public enum DayOfWeek {
	MONDAY(1), TUESDAY(2), WENSDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

	private int num;

	DayOfWeek(int num) {
		this.num = num;

	}

	public int getNum() {
		return num;
	}
}
