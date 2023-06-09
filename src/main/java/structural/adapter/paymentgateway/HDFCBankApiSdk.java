package structural.adapter.paymentgateway;

public class HDFCBankApiSdk {

    public double getAccountBalance(String acc){
        System.out.println("Getting balance from HDFC bank account no: " + acc);
        return 1000;
    }

    public boolean transferMoney(double amt, String from, String to ){
        System.out.println("Transferring: "+ amt + " from HDFC bank acc: "
                + from + ", to acc: " + to );
        return true;
    }
}
