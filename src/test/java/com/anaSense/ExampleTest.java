package com.anaSense;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    @Test
    void shouldOpen() {
        LocalDate parsed = LocalDate.parse("28.11.2020", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        assertEquals(DayOfWeek.SATURDAY, parsed.getDayOfWeek());
    }

    @Test
    void compareWithRandomDigit() {
        Random rand = new Random();
        int i = rand.nextInt(2);
        System.out.println("i = " + i);

        assertEquals(0,i);
    }
}
