package com.satendranegi.javalearnings;

public class IterationDemo {
    public static void main(String[] args) {
        //while,do while,for, for-each loops

        //while loop with pre increment
        int i = 1;
        while (i<=5){

            System.out.println("Hello");

            i++;

        }

        System.out.println("while loop with post increment");
        i = 1;
        while (i<=5){
            System.out.println("Hello "+i);
            ++i;
        }

        System.out.println("Do while loop");
        i=6;
        do {
            System.out.println("Hello ");
        }while (i<=5);

        System.out.println("For loops");

        for (i=1;i<=5;i++){
            System.out.println("Hello ");
        }


    }
}
