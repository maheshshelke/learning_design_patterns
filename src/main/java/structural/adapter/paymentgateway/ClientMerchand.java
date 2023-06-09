package structural.adapter.paymentgateway;

public class ClientMerchand {
    public static void main(String[] args) {
        PyamentGateway pyamentGateway = new ICICIGatewayAdapter();

        String fromAcc = "00010";
        String toAcc = "00020";

        double transferAmt = 500;

        System.out.println("Getting balance: " + pyamentGateway.getBalance(fromAcc));

        System.out.println("Transfer money status: " +
                pyamentGateway.sendMoney(fromAcc, toAcc, transferAmt));

    }
}
