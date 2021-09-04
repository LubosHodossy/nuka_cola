package Bublani.java;

public class UkazkaPrikazovyRiadok {
    public static void main(String[] args) {
        System.out.println("Argumenty príkazového riadku: " + args.length);

        System.out.println("Jedná sa o: ");
        for (int i=0; i<args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
