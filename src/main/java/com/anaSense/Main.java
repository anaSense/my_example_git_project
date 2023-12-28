package com.anaSense;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(getRandomMessage());
    }

    public static String getRandomMessage() {
        Random rand = new Random();
        int i = rand.nextInt(10);
        System.out.println("i = " + i);
        if (i == 0) {
            return "Hello QA GURU?";
        } else if (i == 1) {
            return "Hello World?";
        } else if (i>1 && i<5) {
            return "Hello IntelliJ IDEA?";
        } else {
            return "Hello Java?";
        }
    }
}