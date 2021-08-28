package com.satendranegi.javalearnings;

public class ForEachLoopDemo {

    public static void main(String[] args) {

        int oneDArray[] = {1,2,3,4,5,6};
        int a[][] = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 11, 12, 13}
                    };

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("-----------------");
        for (int results : oneDArray){
            System.out.print(results + " ");
        }
        System.out.println();
        System.out.println("-------------");

        System.out.println("Using for each-----------------");
        for(int result[] : a){
            for (int innerResults : result)
            System.out.print(innerResults + " ");
            System.out.println();
        }

    }
}
