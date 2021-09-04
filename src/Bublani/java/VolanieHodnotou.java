package Bublani.java;

class Test {
    void bezZmeny (int i, int j) {
        i = i + j;
        j = -j;
    }
}

class VolanieHodnotou {
    public static void main(String[] args) {
        Test obj = new Test();
        int a = 15, b = 20;

        System.out.println("a, b pred volaním: " + a + " " + b);
        obj.bezZmeny (a, b);
        System.out.println("a, b po volaniach: " + a + " " + b);
    }
}
