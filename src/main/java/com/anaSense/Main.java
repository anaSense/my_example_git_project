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
        String message = "";
        if (i == 0) {
            return message = "Hello QA GURU?";
        } else if (i == 1) {
            return message = "Hello World?";
        } else {
            return message = "Hello IntelliJ IDEA?";
        }
    }
}