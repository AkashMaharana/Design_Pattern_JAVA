package abstractFactoryPattern;

public class MicroCar extends Car{

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Constructing a MICRO car.");
	}

}
