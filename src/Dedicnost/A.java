package Dedicnost;

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void zobraz() {
        System.out.println("i a j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void zobraz(String msg) {
        System.out.println(msg + k);
    }
}

class Pretazenie {
    public static void main(String[] args) {
        B podObj = new B(1, 2, 3);

        podObj.zobraz("Toto je k: ");

        podObj.zobraz();
    }
}
