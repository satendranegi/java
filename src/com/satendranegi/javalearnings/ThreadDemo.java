package com.satendranegi.javalearnings;

class Hi extends Thread{
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(500);
            }catch (Exception e){};
        }

    }
}

class Hello extends Thread{

    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(500);
            }catch (Exception e){};
        }

    }
}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {

        Hi hi = new Hi();
        Hello hello = new Hello();
        hi.start();
        Thread.sleep(100);
        hello.start();
    }
}
