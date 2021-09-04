package Bublani.java;

public class UkazkaString {
    public static void main(String[] args) {
        String retazec1 = new String("Retazce Javy su objekty.");
        String retazec2 = "Zostrojuju sa najroznejsimi sposobmi.";
        String retazec3 = new String(retazec2);

        System.out.println(retazec1);
        System.out.println(retazec2);
        System.out.println(retazec3);
    }
}
