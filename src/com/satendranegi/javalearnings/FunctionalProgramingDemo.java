package com.satendranegi.javalearnings;

import java.util.ArrayList;
import java.util.Collection;

@FunctionalInterface
interface Animal{
    public void eat();
}
//class Dog implements Animal{
//
//    public void eat(){
//        System.out.println("Dog Eating");
//    }
//}
interface Calculator{
    public void addNumbers();
}
public class FunctionalProgramingDemo {

    public static void main(String[] args) {

//        Animal dog = new Dog();
//        dog.eat();

        Animal dog = () -> System.out.println("Dog is eating");
        dog.eat();
        int a = 10;
        int b = 100;
        Calculator calculator = () -> System.out.println("Sum is:" + (a+b));
        calculator.addNumbers();

    }
}
