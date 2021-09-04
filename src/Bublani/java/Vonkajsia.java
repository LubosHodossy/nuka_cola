package Bublani.java;

class Vonkajsia {
    int cisla[];

    Vonkajsia(int c[]) {
        cisla = c;
    }

    void analyzuj() {
        Vnutorny vnutornyObj = new Vnutorny();

        System.out.println("Minimum: " + vnutornyObj.min());
        System.out.println("Maximum: " + vnutornyObj.max());
        System.out.println("Priemer: " + vnutornyObj.avg());
    }

    class Vnutorny {
        int min() {
            int z = cisla[0];

            for (int i=1; i<cisla.length; i++)
                if (cisla[i] < z) z = cisla[i];

                return z;
        }

        int max() {
            int z = cisla[0];

            for (int i=1; i<cisla.length; i++)
                if (cisla[i] > z) z = cisla[i];

                return z;
        }

        int avg() {
            int p = 0;

            for (int i=0; i<cisla.length; i++)
                p += cisla[i];

            return p/cisla.length;
        }
    }
}

class UkazkaVnutornaTrieda {
    public static void main(String[] args) {
        int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 };
        Vonkajsia vonkajsiaObj = new Vonkajsia(x);

        vonkajsiaObj.analyzuj();
    }
}
