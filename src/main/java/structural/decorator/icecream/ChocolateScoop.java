package structural.decorator.icecream;

public class ChocolateScoop implements Icecream{
    Icecream icecream;

    public ChocolateScoop(Icecream icecream) {
        if (icecream == null) {
            throw new IllegalStateException("Invalid state: Add a cone before adding scoop");
        }
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream == null)
            return 35;
        return icecream.getCost() + 35;
    }

    @Override
    public String getDescription() {
        if(icecream == null)
            return "Chocolate Scoop, ";
        return icecream.getDescription() + "Chocolate Scoop, ";
    }
}
