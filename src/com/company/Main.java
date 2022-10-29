package com.company;

public class Main {

    public static void main(String[] args) {
        double[] v = {345.2, -295.0, 70.0, 251.0, 100.0, -34.7, 486.9, 46.6, 12.2, 115.5, 98.2, 77.3, 383.0, -29.2, 66.6, 122.2, 15.5}; // 1845/13
        int index = 0;
        double sum = 0.0;
        boolean on = false;
        for (double summedNumbers : v) {
            if (summedNumbers < 0) {
                on = true;
            } else if (on) {
                sum += summedNumbers;
                index++;
            }
        }
        System.out.println(index);
        System.out.println(sum);
        System.out.println("my answer " + sum / index);
    }
}
