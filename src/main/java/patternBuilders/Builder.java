package patternBuilders;

import patternBuilders.cars.CarType;
import patternBuilders.components.Engine;
import patternBuilders.components.GPSNavigator;
import patternBuilders.components.Transmission;
import patternBuilders.components.TripComputer;

public interface Builder {

	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}


