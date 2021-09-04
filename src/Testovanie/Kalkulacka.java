package Testovanie;

import java.util.Scanner;

public class Kalkulacka {
    static boolean ukoncit = false;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while(!ukoncit) {
            ukazMenu();
        }

    }

    public static void ukazMenu() {
        System.out.print("1.) Scitat\n2.) Odcitat\n0.) Ukoncit\nZadajte vašu volbu: ");
        switch (in.nextInt()) {
            case 1:
                scitaj();
                break;
            case 2:
                odcitaj();
                break;
            case 0:
                ukoncit = true;
                break;
            default:
                ukazMenu("Neplatná volba! Zadaj znovu");
        }
    }
    public static void odcitaj() {
        System.out.print("Zadajte menšenec: ");
        int mensenec = in.nextInt();
        System.out.print("Zadajte menšitel: ");
        int mensitel = in.nextInt();
        System.out.println("Výsledok je: " + (mensenec - mensitel) + "\n\n");
    }
    public static void scitaj() {
        System.out.print("Zadajte prví sčítanec: ");
        int prvy = in.nextInt();
        System.out.print("Zadajte druhý sčítanec: ");
        int druhy = in.nextInt();
        System.out.println("Výsledok je: " + (prvy + druhy) + "\n\n");
    }
    public static void ukazMenu(String sprava) {
        System.out.println(sprava);
        ukazMenu();
    }
}
