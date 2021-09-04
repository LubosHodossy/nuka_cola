package Bublani.java;

public class SwitchRetazec {
    public static void main(String[] args) {
        String prikaz = "zrusit";

        switch(prikaz) {
            case "pripojit":
                System.out.println("Pripájam");
                break;
            case "zrusit":
                System.out.println("Ruším");
                break;
            case "odpojit":
                System.out.println("Odpájam");
                break;
            default:
                System.out.println("Chybný príkaz!");
                break;
        }
    }
}
