package com.hillel.company;

public class Runner {

    //variables for Cycles
    private static final int FromNumCycles = 10;
    private static final int ToNumCycles = 20;
    private static final int[] Array = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    //variables for Divide
    private static final int FromNumDivide = 1;
    private static final int ToNumDivide = 100;
    private static final int Divider = 3;

    //variables for Calculating
    private static final int FirstArg = 1888888;
    private static final int SecondArg = 100;
    private static final int ThirdArg = 3;
    private static final int FourthArg = -8;

    public Runner() {
    }

    public static void main(String[] args) {

        //region Cycles
        System.out.print("Results from cycles: \n");
        Tasks_Cycles.cycleFor(10, 20);
        Tasks_Cycles.cycleWhile(10, 20);
        Tasks_Cycles.cycleDoWhile(10, 20);
        Tasks_Cycles.cycleForEach(Array);
        //endregion

        //region Divide
        Tasks_Divided.printWithoutReminder(1, 100, 3);
        //endregion

        //region Calculating
        int minimum = Tasks_Calculating.minAll(1888888, 100, 3, -8);
        System.out.println("And minimum is: " + minimum + ". \n");
        //endregion
    }
}
