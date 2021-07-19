package abstractFactoryPattern;

public class GermanCarFactory {

	public static Car carBuilder(CarType carType) {
		Car car = null;
		switch (carType) {
		case MINI:
			car = new MiniCar(Location.GERMANY);
			break;
		case MICRO:
			car = new MicroCar(Location.GERMANY);
			break;
		case LUXURY:
			car = new LuxryCar(Location.GERMANY);
			break;
		default:
			break;
		}
		return car;
	}

}
