package com.satendranegi.javalearnings;

class ThisKeyWordCls{

    int number;
    int age;

    public ThisKeyWordCls(int number, int age) {
        this.number = number;
        this.age = age;
    }

    public void isAdult(){
        if(age > 18){
            System.out.println("Adult");
        }else {
            System.out.println("Under 18!! --> "+age);
        }
    }
}

public class ThisKeyWordDemo {
    public static void main(String[] args) {

        ThisKeyWordCls thisKeyWordCls = new ThisKeyWordCls(1,34);
        thisKeyWordCls.isAdult();
    }
}
