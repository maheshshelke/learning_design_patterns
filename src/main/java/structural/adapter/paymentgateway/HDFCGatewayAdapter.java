package structural.adapter.paymentgateway;

public class HDFCGatewayAdapter implements PyamentGateway{
    private HDFCBankApiSdk hdfcBankApiSdk;

    public HDFCGatewayAdapter() {
        System.out.println("Initializing payment gateway to HDFC bak adapter");
        this.hdfcBankApiSdk  = new HDFCBankApiSdk();
    }

    @Override
    public double getBalance(String accNumber) {
        System.out.println("Getting balance from HDFC Gateway Adapter.");
        return hdfcBankApiSdk.getAccountBalance(accNumber);
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        System.out.println("Initiating money transfer from HDFC Gateway Adapter.");
        return hdfcBankApiSdk.transferMoney(amount, fromAcc, toAcc);
    }
}
