package creational.builder.carcomplex;

public class Client {

    public static void main(String[] args) {
        // Building the Car without Director
        Car.CarBuilder carBuilderWithoutDirector =
                (Car.CarBuilder) Car.getCarBuilder().setCarType(CarType.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(3.0, 0))
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
        Car carWithoutDirector = carBuilderWithoutDirector.build();
        System.out.println("::: Car without director ::: ");
        System.out.println(carWithoutDirector.toString());


        // Building the Car with Director
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        Car.CarBuilder builder = Car.getCarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.build();
        System.out.println("Car built:\n" + car.toString());


        Manual.CarManualBuilder manualBuilder = Manual.getCarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.build();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}

