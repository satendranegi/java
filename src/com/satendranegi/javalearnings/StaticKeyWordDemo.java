package com.satendranegi.javalearnings;

class StaticKeyWord{

    int emplyeeId;
    String name;
    static String company;

    static {
        company = "Google Inc.";
    }

    public StaticKeyWord(int emplyeeId, String name) {
        this.emplyeeId = emplyeeId;
        this.name = name;
    }

}
public class StaticKeyWordDemo {

    public static void main(String[] args) {

        StaticKeyWord staticKeyWord = new StaticKeyWord(1001,"Satendra");
        StaticKeyWord staticKeyWord1 = new StaticKeyWord(1002,"Ram");

        System.out.println("EmployeeID :"+staticKeyWord.emplyeeId+" Name :"+staticKeyWord.name+" Company :"+StaticKeyWord.company);
        System.out.println("EmployeeID :"+staticKeyWord1.emplyeeId+" Name :"+staticKeyWord1.name+" Company :"+StaticKeyWord.company);

    }
}
