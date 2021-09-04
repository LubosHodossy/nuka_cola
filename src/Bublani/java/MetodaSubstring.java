package Bublani.java;

public class MetodaSubstring {
    public static void main(String[] args) {
        String povodnyRetazec = "Java je popiči.";

        String podretazec = povodnyRetazec.substring(5, 15);

        System.out.println("povodnyRetazec: " + povodnyRetazec);
        System.out.println("podretazec: " + podretazec);
    }
}
