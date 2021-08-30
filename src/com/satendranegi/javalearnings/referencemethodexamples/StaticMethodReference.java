package com.satendranegi.javalearnings.referencemethodexamples;

interface Sayble{
    void say();
}

public class StaticMethodReference {

    public static void main(String[] args) {

        Sayble sayble =  ()-> System.out.println("Hello from Sayble");
        sayble.say();

    }
}
