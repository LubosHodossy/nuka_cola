package Bublani.java;

public class PoleRetazcov {
    public static void main(String[] args) {
        String retazce[] = { "Toto", "je", "iba", "test." };

        System.out.println("Pôvodné pole: ");
        for (String s : retazce)
            System.out.print(s + " ");
        System.out.println("\n");

        retazce[1] = "bol";
        retazce[2] = "tiež";

        System.out.println("Upravené pole: ");
        for (String s : retazce)
            System.out.print(s + " ");
    }
}
