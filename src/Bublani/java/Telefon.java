package Bublani.java;

public class Telefon {
    public static void main(String[] args) {
        String telCisla[][] = {
                { "Peter", "582 331 122" },
                { "Maria", "582 890 176" },
                { "Jan", "582 100 337" },
                { "Radka", "582 140 490" }
        };
        int i;

        if (args.length != 1)
            System.out.println("Použitie: java Telefon <meno>");
        else {
            for (i=0; i<telCisla.length; i++) {
                if (telCisla[i][0].equals(args[0])) {
                    System.out.println(telCisla[i][0] + ": " + telCisla[i][1]);
                    break;
                }
            }
            if (i == telCisla.length)
                System.out.println("Meno nebolo najdene.");
        }
    }
}
