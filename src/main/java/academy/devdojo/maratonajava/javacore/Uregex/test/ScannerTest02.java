package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String text = "Levi,Eren,Mikasa,true,false,200,300";
        Scanner sc = new Scanner(text);
        sc.useDelimiter(",");

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                System.out.println("Int: " + sc.nextInt());
            } else if (sc.hasNextBoolean()) {
                System.out.println("Boolean: " + sc.nextBoolean());
            } else {
                System.out.println(sc.next());
            }
        }
        sc.close();
    }
}
