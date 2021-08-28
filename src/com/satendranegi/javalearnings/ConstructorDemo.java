package com.satendranegi.javalearnings;
class ConstructorDemoClass{

    int a;
    int b;
    int results;
    ConstructorDemoClass(){
    a=2;
    b=3;
    }

    ConstructorDemoClass(int k){
        a = 2;
        b = k;
    }

    public void performOperation(){
        results = a + b;
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        ConstructorDemoClass constructorDemoObj = new ConstructorDemoClass();
        constructorDemoObj.performOperation();
        System.out.println(constructorDemoObj.results);

        constructorDemoObj.a = 3;
        constructorDemoObj.b = 3;
        constructorDemoObj.performOperation();

        System.out.println(constructorDemoObj.results);

        ConstructorDemoClass constructorDemoClassObj = new ConstructorDemoClass(100);
        constructorDemoClassObj.performOperation();
        System.out.println(constructorDemoClassObj.results);
    }
}
