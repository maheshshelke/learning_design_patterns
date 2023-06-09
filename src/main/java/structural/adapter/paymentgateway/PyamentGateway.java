package structural.adapter.paymentgateway;

public interface PyamentGateway {
    double getBalance(String accNumber);

    boolean sendMoney(String fromAcc, String toAcc, double amount);
}
