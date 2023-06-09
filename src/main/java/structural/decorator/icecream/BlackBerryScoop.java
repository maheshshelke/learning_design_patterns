package structural.decorator.icecream;

public class BlackBerryScoop implements Icecream{

    Icecream icecream;

    public BlackBerryScoop(Icecream icecream) {
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
            return 30;
        return icecream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        if(icecream == null)
            return "Blackberry Scoop, ";
        return icecream.getDescription() + "Blackberry Scoop, ";
    }
}
