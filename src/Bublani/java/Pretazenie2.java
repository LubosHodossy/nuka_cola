package Bublani.java;

class Pretazenie2 {
    void f(byte x) {
        System.out.println("Vnútri f(byte): " + x);
    }

    void f(int x) {
        System.out.println("Vnútri f(int): " + x);
    }

    void f(double x) {
        System.out.println("Vnútri f(double): " + x);
    }
}

class PrevodyTypu {
    public static void main(String[] args) {
        Pretazenie2 obj = new Pretazenie2();
        int i = 10;
        double d = 10.1;
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        obj.f(i);
        obj.f(d);
        obj.f(b);
        obj.f(s);
        obj.f(f);
    }
}
