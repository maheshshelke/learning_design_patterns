package creational.builder.carcomplex;


public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", tripComputer=" + tripComputer +
                ", gpsNavigator=" + gpsNavigator +
                ", fuel=" + fuel +
                '}';
    }

    public static CarBuilder getCarBuilder(){
        return new CarBuilder();
    }


    public static class CarBuilder implements Builder {
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

        public Car build() {
            return new Car(type, seats, engine,
                    transmission, tripComputer, gpsNavigator);
        }
    }
}
