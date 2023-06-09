package structural.decorator.icecream;

public class Client {
    public static void main(String[] args) {
        Icecream icecream =
                new ChocolateScoop(
                    new VanillaScoop(
                        new BlackBerryScoop(
                            new OrangeCone(
                                new ChocolateCone()))));

        System.out.println(icecream.getDescription());
        System.out.println(icecream.getCost());
    }
}
