package academy.devdojo.maratonajava.javacore.Kenumeracao.test;

import academy.devdojo.maratonajava.javacore.Kenumeracao.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenumeracao.domain.ClientType;
import academy.devdojo.maratonajava.javacore.Kenumeracao.domain.PaymentType;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client01 = new Client("Baiano", ClientType.PESSOA_JURIDICA, PaymentType.DEBITO);
        Client client02 = new Client("Baiano", ClientType.PESSOA_FISICA, PaymentType.CREDITO);
        System.out.println(client01);
        System.out.println(client02);
        System.out.println(ClientType.clientTypeByName("Pessoa Jurídica"));
    }
}
