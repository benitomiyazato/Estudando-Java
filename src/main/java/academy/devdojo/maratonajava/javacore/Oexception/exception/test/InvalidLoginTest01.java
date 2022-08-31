package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.util.Scanner;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.InvalidLoginException;

public class InvalidLoginTest01 {
    public static boolean logged = false;
    public static final String USERNAME_DB = "Goku";
    public static final String PASSWORD_DB = "carrospotentes";

    public static void main(String[] args) {
        while (!InvalidLoginTest01.logged) {
            try {
                logIn();
            } catch (InvalidLoginException e) {
                e.printStackTrace();
            }
        }
    }

    private static void logIn() throws InvalidLoginException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira Usuário");
        String typedUsername = sc.nextLine();
        System.out.println("Insira Senha");
        String typedPassword = sc.nextLine();
        if (!typedUsername.equals(USERNAME_DB) || !typedPassword.equals(PASSWORD_DB)) {
            sc.close();
            throw new InvalidLoginException("Usuário ou senha inválidos");
        } else {
            System.out.println("LOGADO COM SUCESSO!");
            InvalidLoginTest01.logged = true;
            sc.close();
        }
    }
}
