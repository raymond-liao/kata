package com.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
    @Test
    public void should_1_inch_equals_1_inch() {
        assertEquals(new Length(1, "Inch"), new Length(1, "Inch"));
    }

    @Test
    public void should_1_foot_equals_1_foot() {
        assertEquals(new Length(1, "Foot"), new Length(1, "Foot"));
    }

    @Test
    public void should_display_internal_information_friendly() {
        assertEquals(new Length(1, "Inch").toString(), "1 (Inch)");
        assertEquals(new Length(1, "Foot").toString(), "1 (Foot)");
        assertEquals(new Length(1, "Yard").toString(), "1 (Yard)");
    }

    @Test
    public void should_1_foot_equals_12_inches() {
        assertEquals(new Length(1, "Foot"), new Length(12, "Inch"));
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        assertEquals(new Length(1, "Yard"), new Length(3, "Foot"));
    }
}
