package Builder.builders;

import Builder.builders.cars.CarType;
import Builder.builders.components.Engine;
import Builder.builders.components.GPSNavigator;
import Builder.builders.components.Transmission;
import Builder.builders.components.TripComputer;


public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}