package Bublani.java;

class MojaTrieda2 {
    int x;

    MojaTrieda2(int i, int j) {
        System.out.println("Vnútri MojaTrieda2(int, int).");
        x = i * j;
    }

    MojaTrieda2() {
        System.out.println("Vnútri MojaTrieda2().");
        x = 0;
    }

    MojaTrieda2(int i) {
        System.out.println("Vnútri MojaTrieda2(int).");
        x = i;
    }

    MojaTrieda2(double d) {
        System.out.println("Vnútri MojaTrieda2(double).");
        x = (int) d;
    }
}

class PretazovanieKonstruktorov {
    public static void main(String[] args) {
        MojaTrieda2 t1 = new MojaTrieda2();
        MojaTrieda2 t2 = new MojaTrieda2(88);
        MojaTrieda2 t3 = new MojaTrieda2(17.23);
        MojaTrieda2 t4 = new MojaTrieda2(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}
