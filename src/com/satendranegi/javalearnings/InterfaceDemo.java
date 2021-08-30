package com.satendranegi.javalearnings;

@FunctionalInterface
interface AnimalVersion2{

    default void eat(){
        System.out.println("Eeating");
    }
    default void move(){
        System.out.println("Moving");
    }
    public void sound();

}

//class Dog implements AnimalVersion2{
//
//
//    @Override
//    public void sound() {
//
//        System.out.println("Bhoww Bhoww");
//    }
//}
public class InterfaceDemo {

    public static void main(String[] args) {

        //AnimalVersion2 animalVersion2 = new Dog();
        //animalVersion2.eat();
        //animalVersion2.move();
        //animalVersion2.sound();

        AnimalVersion2 animalVersion21 = () -> System.out.println("Bhoww Bhoww");

        animalVersion21.eat();
        animalVersion21.move();
        animalVersion21.sound();
    }
}
