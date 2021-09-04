package com.java;

class UkazkaKamion {
    public static void main(String[] args) {
        Kamion tahac = new Kamion(2, 756, 30, 20000);
        Kamion pickup = new Kamion(3, 105, 15, 900);
        double litrov;
        int vzdialenost = 252;
        litrov = tahac.potrebnepalivo(vzdialenost);

        System.out.println("Ťahač môže viesť " + tahac.vratNosnost() + " kg.");
        System.out.println("Ťahač pre prejdenie " + vzdialenost + " km potrebuje " + litrov + " litrov paliva.\n");

        litrov = pickup.potrebnepalivo(vzdialenost);

        System.out.println("Pickup môže viesť " + pickup.vratNosnost() + " kg.");
        System.out.println("Pickup pre prejdenie " + vzdialenost + " km potrebuje " + litrov + " litrov paliva.");
    }
}
