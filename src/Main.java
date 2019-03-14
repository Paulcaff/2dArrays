//package com.company;

public class Main {

    public static void main(String[] args) {
        Medals medals = new Medals();
        medals.set(0,0, 1);
        medals.set(0, 2, 1);
        medals.set(3, 0, 1);
        medals.set(4, 1, 1);
        medals.set(5, 2, 1);
        medals.set(6, 1, 1);

        //etc
        medals.display();

        int totalMedals = medals.total();

        System.out.println("\n\nTotal medals " + totalMedals);

        int[] countryTotals = medals.calculateRowTotals();

        //Display the row totals
        System.out.println("Row Totals: ");
        for (int i = 0; i < countryTotals.length; i++) {
            System.out.println(countryTotals[i]);
        }

        int[] medalTotals = medals.calculateColumnTotals();
        //Display the row totals
        System.out.println("Medal Totals: ");
        for (int i = 0; i < medalTotals.length; i++) {
            System.out.println(medalTotals[i]);
        }

    }
}
