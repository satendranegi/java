package com.satendranegi.javalearnings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Parser{
    String parse(String s);
}

class StringParser{
    public static String convert(String s){
        if(s.length()<=3){
            s = s.toUpperCase();
        }else{
           s =  s.toLowerCase();
        }
        return s;
    }
}

class MyPrinter{
    public void print(String str,Parser parser){
        str = parser.parse(str);
        System.out.println(str);
    }
}

public class MethodReferenceDemo {

    public static void main(String[] args) {

        String str = "Satendra";
        MyPrinter myPrinter = new MyPrinter();
        myPrinter.print(str, (StringParser::convert));
    }
}
