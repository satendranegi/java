package com.satendranegi.javalearnings;

public class TernaryOperator {

    public static void main(String[] args) {
        int i = 2;
        int j = 3;

        //via if else selection
        if(i>3)
            j = 1;
        else
            j = 2;
        System.out.println(j);


        //via ternary operator
        j = i>3?1:2;

        System.out.println(j);

    }
}
