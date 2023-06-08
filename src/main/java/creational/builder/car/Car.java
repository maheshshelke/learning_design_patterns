package creational.builder.car;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public static class Builder {
        private final String brand;
        private final String model;
        private int year;
        private String color = "Black";

        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
