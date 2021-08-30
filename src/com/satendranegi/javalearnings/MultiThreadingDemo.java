package com.satendranegi.javalearnings;

class Counter implements Runnable{

    int counter;

    @Override
    public void run() {

        counter = counter + 1;

    }
}
public class MultiThreadingDemo {

    public static void main(String[] args) {

        Counter counterobj = new Counter();

        Thread t1 = new Thread();
        //t1.start();
        for (int i=1;i<=1000;i++){

            counterobj.run();
        }

        System.out.println(counterobj.counter);

         }
}
