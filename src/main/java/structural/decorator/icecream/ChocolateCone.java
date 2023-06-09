package structural.decorator.icecream;

public class ChocolateCone implements Icecream{

    Icecream icecream;

    public ChocolateCone(){};

    public ChocolateCone(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream == null)
            return 15;
        return icecream.getCost() + 15;
    }

    @Override
    public String getDescription() {
        if(icecream == null)
            return "Chocolate Cone, ";
        return icecream.getDescription() + "Chocolate Cone, ";
    }
}
