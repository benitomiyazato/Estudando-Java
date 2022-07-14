package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        // nao podem existir chaves duplicadas
        // LinkedHashMap mantem a ordem de inserção

        Map<String, String> map = new HashMap<>();
        map.put("tekladi", "teclado");
        map.put("mouze", "mouse");

        map.put("vc", "você");
        map.put("vc", "você2");
        // no map, valores inseridos com a msm chave sao sobrescritos
        map.putIfAbsent("vc", "você3"); // esse metodo só exec put se n existir essa key

        for (String key : map.keySet()) {
            System.out.printf("Key: %s ->  Value: %s\n", key, map.get(key));
        }
        System.out.println("------=------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}
