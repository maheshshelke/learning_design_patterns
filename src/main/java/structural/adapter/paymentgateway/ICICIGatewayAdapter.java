package structural.adapter.paymentgateway;

public class ICICIGatewayAdapter implements PyamentGateway{
    private ICICIBankApiSdk iciciBankApiSdk;

    public ICICIGatewayAdapter() {
        System.out.println("Initializing payment gateway to ICICI bak adapter");
        this.iciciBankApiSdk = new ICICIBankApiSdk();
    }

    @Override
    public double getBalance(String accNumber) {
        System.out.println("Getting balance from ICICI Gateway Adapter.");
        return iciciBankApiSdk.getAccountBalance(accNumber);
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("Initiating money transfer from ICICI Gateway Adapter.");
        return iciciBankApiSdk.transferMoney(fromAcc, toAcc, amount);
    }
}
