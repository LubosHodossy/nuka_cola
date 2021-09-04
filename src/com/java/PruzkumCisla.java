package com.java;

class Delitel {
    boolean jeDelitel(int a, int b) {
        if ((b % a) == 0) return true;
        else return false;
    }
}

class UkazkaDvaParametry {
    public static void main(String[] args) {
        Delitel x = new Delitel();

        if (x.jeDelitel(2, 20)) System.out.println("2 je delitel.");
        if (x.jeDelitel(3, 20)) System.out.println("toto sa nezobrazí");
    }
}
