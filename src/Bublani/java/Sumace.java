package Bublani.java;

class Sumace {
    int sum;

    Sumace(int cislo) {
        sum = 0;
        for (int i=1; i <= cislo; i++)
            sum += i;
    }

    Sumace(Sumace obj) {
        sum = obj.sum;
    }
}

class UkazkaSumace {
    public static void main(String[] args) {
        Sumace s1 = new Sumace(5);
        Sumace s2 = new Sumace(s1);

        System.out.println("s1.sum: " + s1.sum);
        System.out.println("s2.sum: " + s2.sum);
    }
}
