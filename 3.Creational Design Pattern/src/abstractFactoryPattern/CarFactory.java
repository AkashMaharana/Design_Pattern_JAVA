package abstractFactoryPattern;

public class CarFactory {

	public static Car buildCar(CarType carType) throws LocationNotFoundException {

		Car car = null;

		// Location service will get the current Location
		Location location = Location.USA;

		switch (location) {
		case INDIA:
			car = IndiaCarFactory.carBuilder(carType);
			break;
		case USA:
			car = USACarFactory.carBuilder(carType);
			break;
		case GERMANY:
			car = GermanCarFactory.carBuilder(carType);
			break;
		default:
			throw new LocationNotFoundException("Factory doesn't esixt in the serach location.");
		}
		return car;

	}

}
