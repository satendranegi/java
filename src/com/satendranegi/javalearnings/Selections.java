package com.satendranegi.javalearnings;

public class Selections {

    public static void main(String[] args) {
        int number = 3;
        if(number>4)
            System.out.println("the number is greater then four");
        else
            System.out.println("the number is less then 4");

        number = 5;
        if(number > 6){
            System.out.println("the number is greater then 6");
            int substractionNumber = number - 6;
            System.out.println("Please substract "+substractionNumber+ " to make it less then or equal to 6");

        } else{
            System.out.println("the number is less then 6");
        }

    }
}
