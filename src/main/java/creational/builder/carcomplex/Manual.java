package creational.builder.carcomplex;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }

    public static CarManualBuilder getCarManualBuilder(){
        return new CarManualBuilder();
    }

    public static class CarManualBuilder implements Builder{
        private CarType type;
        private int seats;
        private Engine engine;
        private Transmission transmission;
        private TripComputer tripComputer;
        private GPSNavigator gpsNavigator;

        public Builder setCarType(CarType type) {
            this.type = type;
            return this;
        }

        @Override
        public Builder setSeats(int seats) {
            if(seats < 1)
                throw new IllegalArgumentException("Seats cannot be less than 1.");
            else if (seats > 6)
                throw new IllegalArgumentException("Seats cannot be more than 6.");

            this.seats = seats;
            return this;
        }

        @Override
        public Builder setEngine(Engine engine) {
            if(engine.getVolume() < 0 )
                throw new IllegalArgumentException("Engine cannot have -ve volume.");
            this.engine = engine;
            return this;
        }

        @Override
        public Builder setTransmission(Transmission transmission) {
            this.transmission = transmission;
            return this;
        }

        @Override
        public Builder setTripComputer(TripComputer tripComputer) {
            this.tripComputer = tripComputer;
            return this;
        }

        @Override
        public Builder setGPSNavigator(GPSNavigator gpsNavigator) {
            this.gpsNavigator = gpsNavigator;
            return this;
        }

        public Manual build() {
            return new Manual(type, seats, engine,
                    transmission, tripComputer, gpsNavigator);
        }
    }

}