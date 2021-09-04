package Bublani.java;

class UkazkaLokalnaTrieda {
    public static void main(String[] args) {
        class ZobrazBity {
            int pocetBitov;

            ZobrazBity(int n) {
                pocetBitov = n;
            }

            void zobraz(long hodnota) {
                long maska = 1;

                maska <<= pocetBitov -1;

                int oddelovac = 0;
                for (; maska != 0; maska >>>= 1) {
                    if ((hodnota & maska) != 0) System.out.print("1");
                    else System.out.print("0");
                    oddelovac++;
                    if ((oddelovac % 8) == 0) {
                        System.out.print(" ");
                        oddelovac = 0;
                    }
                }
                System.out.println();
            }
        }

        for (byte b = 0; b < 10; b++) {
            ZobrazBity zbBajt = new ZobrazBity(8);
            System.out.print(b + " binárne: ");
            zbBajt.zobraz(b);
        }
    }
}
