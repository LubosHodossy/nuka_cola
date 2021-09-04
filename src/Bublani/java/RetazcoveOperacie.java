package Bublani.java;

public class RetazcoveOperacie {
    public static void main(String[] args) {
        String retazec1 = "V oblasti webového programovania je Java #1.";
        String retazec2 = new String(retazec1);
        String retazec3 = "Reťazce v Jave sú popiči.";
        int vysledok, index;
        char zn;

        System.out.println("Dĺžka reťazca retazec1: " + retazec1.length());

        for (int i=0; i<retazec1.length(); i++)
            System.out.print(retazec1.charAt(i));
        System.out.println();

        if (retazec1.equals(retazec2))
            System.out.println("retazec1 sa rovná retazec2");
        else
            System.out.println("retazec1 sa nerovná retazec2");

        if (retazec1.equals(retazec3))
            System.out.println("retazec1 sa rovná retazec3");
        else
            System.out.println("retazec1 sa nerovná retazec3");

        vysledok = retazec1.compareTo(retazec3);
        if (vysledok == 0)
            System.out.println("retazec1 a retazec3 sú rovnaké");
        else if (vysledok<0)
            System.out.println("retazec1 je menší ako retazec3");
        else
            System.out.println("retazec1 je vacsi ako retazec3");

        retazec2 = "Jedna Dva Tri Jedna";

        index = retazec2.indexOf("Jedna");
        System.out.println("Index prvého výskytu Jedna: " + index);
        index = retazec2.lastIndexOf("Jedna");
        System.out.println("Index posledného výskytu Jedna: " + index);
    }
}