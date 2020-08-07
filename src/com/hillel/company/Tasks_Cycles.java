package com.hillel.company;


public class Tasks_Cycles {

    static void cycleFor(int from, int to){
        System.out.print("'For': ");
        for (int i = from; i <= to; i++){
            if(i != to){
                System.out.print(i + ", ");
            }else{
                System.out.print(i + ". \n");
            }
        }
    }

    static void cycleWhile(int from, int to){
        System.out.print("'While': ");
        while (from <= to){
            if(from != to){
                System.out.print(from + ", ");
            }else{
                System.out.print(from + ". \n");
            }
            from++;
        }
    }
    static void cycleDoWhile(int from, int to){
        System.out.print("'Do-While': ");
        do{
            if(from != to){
                System.out.print(from + ", ");
            }else{
                System.out.print(from + ". \n");
            }
            from++;
        }while (from <= to);
    }
    static void cycleForEach(int [] elements){
        System.out.print("'For-Each': ");
        for (int element: elements){
            if(element != elements[elements.length -1]){
                System.out.print(element + ", ");
            }else{
                System.out.print(element + ". \n");
            }
        }
    }
}
