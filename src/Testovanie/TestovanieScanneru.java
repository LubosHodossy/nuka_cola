package Testovanie;

import java.util.Scanner;

public class TestovanieScanneru {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadaj svoje meno: ");
        String meno;
        meno = in.nextLine();
        pozdrav(meno);
        System.out.println("Ako sa dnes máš ?");
    }

    public static void pozdrav(String arg) {
        System.out.println("Ahoj " + arg);
    }
}
