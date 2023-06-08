package creational.builder.car;

public class CarClient {
    public static void main(String[] args) {
        Car car = new Car.Builder("Ford", "Mustang")
                .year(2020)
                .color("Red")
                .build();

    }
}
