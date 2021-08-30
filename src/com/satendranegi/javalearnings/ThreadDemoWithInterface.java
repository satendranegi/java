package com.satendranegi.javalearnings;

public class ThreadDemoWithInterface {

    public static void main(String[] args) throws InterruptedException {

        Runnable hiDemo = ()-> {
                for (int i=1;i<=5;i++){
                    System.out.println("Hi");
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){};
                }
        };

        Runnable hello = ()-> {
                for (int i=1;i<=5;i++){
                    System.out.println("Hello");
                    try{
                        Thread.sleep(500);
                    }catch (Exception e){};
                }
        };

        Thread t1 = new Thread(hiDemo,"HiDemoThread");
        Thread t2 = new Thread(hello,"HelloDemoThread");
        t1.start();
        Thread.sleep(100);
        t2.start();
        t1.join();
        System.out.println(t2.getName()+" is "+t2.isAlive());
        t2.join();
        System.out.println(t2.isAlive());

        System.out.println("Ok Bye!!");
    }
}
