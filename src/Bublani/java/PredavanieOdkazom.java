package Bublani.java;

class Test2 {
    int a, b;

    Test2 (int i, int j) {
        a = i;
        b = j;
    }

    void zmena (Test2 obj) {
        obj.a = obj.a + obj.b;
        obj.b = -obj.b;
    }
}

public class PredavanieOdkazom {
    public static void main(String[] args) {
        Test2 obj = new Test2 (15, 20);

        System.out.println("obj.a a obj.b pred volanim: " + obj.a + " " + obj.b);
        obj.zmena(obj);
        System.out.println("obj.a a obj.b po volaniach: " + obj.a + " " + obj.b);
    }
}
