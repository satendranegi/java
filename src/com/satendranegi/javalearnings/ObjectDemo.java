package com.satendranegi.javalearnings;

class Calc{

    int num1;
    int num2;
    int results;
    public void perform(){
        results = num1 + num2;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {

        Calc calcobj; // Reference
        calcobj = new Calc(); // assignment
        calcobj.num1 = 1;
        calcobj.num2 = 31;
        calcobj.perform();
        System.out.println(calcobj.results);
    }
}
