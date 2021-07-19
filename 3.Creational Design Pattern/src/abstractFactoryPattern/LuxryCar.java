package abstractFactoryPattern;

public class LuxryCar extends Car {

	public LuxryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Constructing a LUXURY car.");
	}

}
