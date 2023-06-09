package structural.decorator.icecream;

public class VanillaScoop implements Icecream{
    Icecream icecream;

    public VanillaScoop(Icecream icecream) {
        if (icecream == null) {
            throw new IllegalStateException(
                "Invalid state: " +
                        "Add a cone before adding scoop");
        }
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream == null)
            return 25;
        return icecream.getCost() + 25;
    }

    @Override
    public String getDescription() {
        if(icecream == null)
            return "Vanilla Scoop, ";
        return icecream.getDescription() + "Vanilla Scoop, ";
    }
}
