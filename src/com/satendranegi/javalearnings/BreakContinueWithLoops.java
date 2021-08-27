package com.satendranegi.javalearnings;

public class BreakContinueWithLoops {
    public static void main(String[] args) {
        int number = 10;

        for (int i=1;i<=number;i++){
            if(i==2)
                continue;
            if(i==8)
                break;
            System.out.println(i);
        }

    }
}
