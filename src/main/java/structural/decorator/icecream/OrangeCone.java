package structural.decorator.icecream;

public class OrangeCone implements Icecream{

    Icecream icecream;

    public OrangeCone(){}

    public OrangeCone(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if(icecream == null)
            return 20;
        return 20 + icecream.getCost();
    }

    @Override
    public String getDescription() {
        if(icecream == null)
            return "Orange Cone, ";
        return icecream.getDescription() + "Orange Cone, ";
    }
}
