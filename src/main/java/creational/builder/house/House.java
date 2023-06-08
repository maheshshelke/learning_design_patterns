package creational.builder.house;

// The product class that defines the type and structure of the complex object
class House {
    // The fields that represent the features of the house
    private String basement;
    private String structure;
    private String roof;
    private String interior;

    // The setters for each field
    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    // A method to display the details of the house
    public void show() {
        System.out.println("House details:");
        System.out.println("Basement: " + basement);
        System.out.println("Structure: " + structure);
        System.out.println("Roof: " + roof);
        System.out.println("Interior: " + interior);
    }
}

// The builder interface that defines the steps to create a house object
interface HouseBuilder {
    // The methods for each step
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    // The method to return the final product
    public House getHouse();
}

// A concrete builder class that implements the steps to create a wooden house
class WoodenHouseBuilder implements HouseBuilder {
    // The house object that is being constructed
    private House house;

    // The constructor that creates a new house object
    public WoodenHouseBuilder() {
        this.house = new House();
    }

    // The implementation of each step
    public void buildBasement() {
        house.setBasement("Wooden Basement");
    }

    public void buildStructure() {
        house.setStructure("Wooden Structure");
    }

    public void buildRoof() {
        house.setRoof("Wooden Roof");
    }

    public void buildInterior() {
        house.setInterior("Wooden Interior");
    }

    // The method to return the final product
    public House getHouse() {
        return this.house;
    }
}

// A concrete builder class that implements the steps to create a brick house
class BrickHouseBuilder implements HouseBuilder {
    // The house object that is being constructed
    private House house;

    // The constructor that creates a new house object
    public BrickHouseBuilder() {
        this.house = new House();
    }

    // The implementation of each step
    public void buildBasement() {
        house.setBasement("Brick Basement");
    }

    public void buildStructure() {
        house.setStructure("Brick Structure");
    }

    public void buildRoof() {
        house.setRoof("Brick Roof");
    }

    public void buildInterior() {
        house.setInterior("Brick Interior");
    }

    // The method to return the final product
    public House getHouse() {
        return this.house;
    }
}

// The director class that controls the algorithm to create a house object
class HouseDirector {
    // The builder object that is used to construct the house
    private HouseBuilder builder;

    // The constructor that takes a builder object as a parameter
    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    // The method that calls the steps of the builder in the correct order
    public void constructHouse() {
        builder.buildBasement();
        builder.buildStructure();
        builder.buildRoof();
        builder.buildInterior();
    }

    // The method that returns the final product
    public House getHouse() {
        return builder.getHouse();
    }
}

// The client class that tests the builder pattern
class BuilderPatternDemo {

    public static void main(String[] args) {

        // Create a wooden house builder object
        HouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();

        // Create a director object with the wooden house builder
        HouseDirector woodenHouseDirector = new HouseDirector(woodenHouseBuilder);

        // Construct a wooden house using the director
        woodenHouseDirector.constructHouse();

        // Get the wooden house object from the director
        House woodenHouse = woodenHouseDirector.getHouse();

        // Display the details of the wooden house
        woodenHouse.show();

        // Create a brick house builder object
        HouseBuilder brickHouseBuilder = new BrickHouseBuilder();

        // Create a director object with the brick house builder
        HouseDirector brickHouseDirector = new HouseDirector(brickHouseBuilder);

        // Construct a brick house using the director
        brickHouseDirector.constructHouse();

        // Get the brick house object from the director
        House brickHouse = brickHouseDirector.getHouse();

        // Display the details of the brick house
        brickHouse.show();
    }
}
