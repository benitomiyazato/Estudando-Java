package academy.devdojo.maratonajava.javacore.Tresourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundlePortuguese = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        ResourceBundle bundleEnglish = ResourceBundle.getBundle("messages", new Locale("en", "US"));

        System.out.println(bundlePortuguese.getString("good.morning"));
        System.out.println(bundleEnglish.getString("good.morning"));

        // messages_en_US.properties --> primeiro busca pelo ResourceBundle especificado 
        // messages_en.properties --> vai fazendo fallback, generalizando mais a linguagem
        // messages_pt_BR.properties --> se não consegue encontrar mesmo assim, vai para o default do sistema
        // messages_pt.properties --> se nao encontra faz fallback de novo generalizando a linguagem
        // messages.properties --> se mesmo assim nao encontra, vai para o message

    }
}
