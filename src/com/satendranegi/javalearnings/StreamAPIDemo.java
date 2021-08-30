package com.satendranegi.javalearnings;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class ConsumeImpl implements Consumer<Integer>{

    @Override
    public void accept(Integer integer) {

        System.out.println(integer);
    }
}

public class StreamAPIDemo {

    public static void main(String[] args) {

        Consumer<Integer> consumer = new ConsumeImpl();


        List<Integer> integerList = new ArrayList<>();

        for (int i=0;i<100;i++){
            integerList.add(i);
        }

        integerList.stream().forEach(i -> System.out.println(i));

    }
}
