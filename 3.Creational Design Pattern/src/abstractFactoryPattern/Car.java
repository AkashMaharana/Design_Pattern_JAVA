package abstractFactoryPattern;

public abstract class Car {

	private CarType carType;
	private Location location;

	public Car(CarType carType, Location location) {
		this.carType = carType;
		this.location = location;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Car of Type " + this.carType + " is getting created in " + this.location+".";
	}

	abstract void construct();

}
