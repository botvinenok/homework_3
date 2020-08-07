package com.hillel.company;

public class Tasks_Calculating {
    public Tasks_Calculating() {
    }

    static int minAll(int first, int second, int third, int fourth) {
        System.out.print("\n\nInput elements for finding minimum: " + first + ", " + second + ", " + third + ", " + fourth + ".\n");
        int firstResult = min(first, second);
        int secondResult = min(third, fourth);
        return min(firstResult, secondResult);
    }

    private static int min(int firstEl, int secondEl) {
        return firstEl < secondEl ? firstEl : secondEl;
    }
}
