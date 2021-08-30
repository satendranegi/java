package com.satendranegi.javalearnings;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIsDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();

        for (int i=1;i<=10;i++){
            list.add(i);
        }

        list.forEach(i -> System.out.print(i));
    }
}
