package com.hillel.company;

public class Tasks_Cycles {
    public Tasks_Cycles() {
    }

    static void cycleFor(int from, int to) {
        System.out.print("'For': ");

        for(int i = from; i <= to; ++i) {
            if (i != to) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ". \n");
            }
        }

    }

    static void cycleWhile(int from, int to) {
        System.out.print("'While': ");

        for(; from <= to; ++from) {
            if (from != to) {
                System.out.print(from + ", ");
            } else {
                System.out.print(from + ". \n");
            }
        }

    }

    static void cycleDoWhile(int from, int to) {
        System.out.print("'Do-While': ");

        do {
            if (from != to) {
                System.out.print(from + ", ");
            } else {
                System.out.print(from + ". \n");
            }

            ++from;
        } while(from <= to);

    }

    static void cycleForEach(int[] elements) {
        System.out.print("'For-Each': ");
        int[] var1 = elements;
        int var2 = elements.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int element = var1[var3];
            if (element != elements[elements.length - 1]) {
                System.out.print(element + ", ");
            } else {
                System.out.print(element + ". \n");
            }
        }

    }
}
