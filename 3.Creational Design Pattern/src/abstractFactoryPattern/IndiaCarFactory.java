package abstractFactoryPattern;

public class IndiaCarFactory {

	public static Car carBuilder(CarType carType) {
		Car car = null;
		switch (carType) {
		case MICRO:
			car = new MicroCar(Location.INDIA);
			break;
		case MINI:
			car = new MiniCar(Location.INDIA);
			break;
		case LUXURY:
			car = new LuxryCar(Location.INDIA);
			break;
		default:
			break;
		}
		return car;
	}

}
