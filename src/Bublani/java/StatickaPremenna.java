package Bublani.java;

class StatickaPremenna {
    int x; // bežná premenná instancia
    static int y; // statická premenná
    int sucet() {
        return x + y;
    }
}

class UkazkaStatic {
    public static void main(String[] args) {
        StatickaPremenna obj1 = new StatickaPremenna();
        StatickaPremenna obj2 = new StatickaPremenna();

        obj1.x = 10;
        obj2.x = 20;
        System.out.println("obj1.x a obj2.x sú samozrejme nezávislé");
        System.out.println("obj1.x: " + obj1.x + "\nobj2.x: " + obj2.x);
        System.out.println();

        System.out.println("Statická premenná y je zdielaná.");
        StatickaPremenna.y = 19;
        System.out.println("StatickaPremenna.y má hodnotu 19.");

        System.out.println("obj1.sucet(): " + obj1.sucet());
        System.out.println("obj2.sucet(): " + obj2.sucet());
        System.out.println();

        StatickaPremenna.y = 100;
        System.out.println("Teraz má StatickaPremenna.y hodnotu 100");

        System.out.println("obj1.sucet(): " + obj1.sucet());
        System.out.println("obj2.sucet(): " + obj2.sucet());
        System.out.println();
    }
}
