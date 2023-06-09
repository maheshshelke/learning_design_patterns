package structural.adapter.paymentgateway;

public class ICICIBankApiSdk {

    public double getAccountBalance(String acc){
        System.out.println("Getting balance from ICICI bank account no: " + acc);
        return 1000;
    }

    public boolean transferMoney(String from, String to, double amt){
        System.out.println("Transferring: "+ amt + " from ICICI bank acc: "
                + from + ", to acc: " + to );
        return true;
    }
}
