package abstractFactoryPattern;

public class USACarFactory {

	public static Car carBuilder(CarType carType) {
		Car car = null;
		switch (carType) {
		case MINI:
			car = new MiniCar(Location.USA);
			break;
		case MICRO:
			car = new MicroCar(Location.USA);
			break;
		case LUXURY:
			car = new LuxryCar(Location.USA);
			break;
		default:
			break;
		}
		return car;
	}

}
