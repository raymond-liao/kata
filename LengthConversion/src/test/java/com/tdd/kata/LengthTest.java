package com.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
    @Test
    public void should_1_inch_equals_1_inch() {
        assertEquals(new Length(1, "Inch"), new Length(1, "Inch"));
    }

    @Test
    public void should_1_foot_equals_12_inch() {
        assertEquals(new Length(1, "Foot"), new Length(12, "Inch"));
    }

    @Test
    public void should_display_internal_information_friendly() {
        assertEquals("1 (Inch)", new Length(1, "Inch").toString());
        assertEquals("1 (Foot)", new Length(1, "Foot").toString());
        assertEquals("1 (Yard)", new Length(1, "Yard").toString());
    }

    @Test
    public void should_1_yard_equals_3_feet() {
        assertEquals(new Length(3, "Foot"), new Length(1, "Yard"));
        assertEquals(new Length(3 * 12, "Inch"), new Length(1, "Yard"));
    }
}
