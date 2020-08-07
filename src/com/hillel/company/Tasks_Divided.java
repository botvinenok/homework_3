package com.hillel.company;

public class Tasks_Divided {

    static void printWithoutReminder(int from, int to, int divider){
        System.out.print("\nResult from divide numbers from " + from
                + " to " + to + " with divider " + divider +" without remainder: \n");

        for (int i = from; i <= to; i++){
            if(i % 3 == 0){System.out.print(i + ", ");}
        }
    }
}
