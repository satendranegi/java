package com.satendranegi.javalearnings;
class calc{
    public void add(int ...i){
        int results = 0;
        for (int element : i){
            results = results + element;
        }

        System.out.println(results);
    }
}
public class VariableLengthArguments {

    public static void main(String[] args) {

        calc calc = new calc();
        calc.add(1,2,3,4,5,100);
    }
}
