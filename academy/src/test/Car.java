package test;

public class Car {
	
	int speed;
	int tankVolume;
	boolean doors4;
	int fuelConsumption;
	
	public Car( int speedNew, int tankVolumeNew, boolean doors4New, int fuelConsumptionNew ) {
		speed = speedNew;
		tankVolume = tankVolumeNew;
		doors4 = doors4New;
		fuelConsumption = fuelConsumptionNew;
	}
	
	public int rangeReserve() {
		int range = tankVolume / fuelConsumption * 100;
		return range;
	}
	
	public void ride() {
		System.out.println("Vrum-vrum");
	}

}
