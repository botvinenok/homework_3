package com.hillel.company;

public class Runner {

    //variables for Cycles
    private static final int FromNumCycles = 10;
    private static final int ToNumCycles = 20;
    private static final int [] Array = {10,11,12,13,14,15,16,17,18,19,20};

    //variables for Dividing
    private static final int FromNumDivide = 1;
    private static final int ToNumDivide = 100;
    private static final int Divider = 3;

    //variables for Calculating
    private static final int FirstArg = 1888888;
    private static final int SecondArg = 100;
    private static final int ThirdArg = 3;
    private static final int FourthArg = -8;

    public static void main(String[] args) {

        //region Cycles
        System.out.print("Results from cycles: \n");

        Tasks_Cycles.cycleFor(FromNumCycles, ToNumCycles);
        Tasks_Cycles.cycleWhile(FromNumCycles, ToNumCycles);
        Tasks_Cycles.cycleDoWhile(FromNumCycles, ToNumCycles);
        Tasks_Cycles.cycleForEach(Array);
        //endregion

        //region Division
        Tasks_Divided.printWithoutReminder(FromNumDivide, ToNumDivide, Divider);
        //endregion

        //region Calculating
        int minimum = Tasks_Calculating.minAll(FirstArg, SecondArg, ThirdArg, FourthArg);
        System.out.println("And minimum is: " + minimum + ". \n");
        //endregion

    }
}
