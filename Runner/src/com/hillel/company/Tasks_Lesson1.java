package com.hillel.company;

import java.util.ArrayList;

public class Tasks_Lesson1 {

    static void printString(int count, String field){
        for (int i = 0; i < count; i++){
            System.out.println(field);
        }
    }

    static void initPrimitive(){
        int myNum = 5;
        byte myByte = -128;
        short myShort = -32768;
        long myLong = 92233720L;
        double myDouble = 4.12;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
    }

    static double calculateSquare(int width, int height){
              double square = width * height;
              return square;
        }

    static void fixExample(int firstEl, int secondEl){
        double result = (double)firstEl / secondEl;
        System.out.println("\nResult for fixing: " + result);
    }

    static void fixExample2(int firstEl, int secondEl, int thirdEl, int fourthEl){
        int result = -firstEl + secondEl - thirdEl + fourthEl;
        System.out.println("\nResult for fixing example 2: " + result);
    }

    static void happyLearning(){
        String  s = "Java";
        //System.out.println("Happy");
        //System.out.println("Java Learning");
        //System.out.println("programming");
        System.out.print("Happy Java");
        //System.out.println("weekend");
        //System.out.println(s);
        //System.out.print("Python");
        System.out.print(" ");
        System.out.println("Learning");

    }

    static void example3(){
        int a = 10;
        int b = 15;
        double c = b + 38;
        //int d = a + 12;
        //double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }

    static ArrayList<Character> transformIntToChar(int... values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i: values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

     static void printList(ArrayList<Character> characters) {
        for (char c: characters) {
            System.out.print(c);
        }
    }


    }




