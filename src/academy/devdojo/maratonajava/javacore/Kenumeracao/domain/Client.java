package academy.devdojo.maratonajava.javacore.Kenumeracao.domain;

public class Client {

    private String name;
    private ClientType clientType;
    private PaymentType paymentType;

    public Client(String name, ClientType clientType, PaymentType paymentType) {
        this.setName(name);
        this.setClientType(clientType);
        this.setPaymentType(paymentType);
    }

    @Override
    public String toString() {
        return "Name:" + this.name + "\nCLient Type:" + this.clientType.name + "\nClient index:" + this.clientType.index
                + "\nPayment Type:" + this.paymentType + "\n";
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
