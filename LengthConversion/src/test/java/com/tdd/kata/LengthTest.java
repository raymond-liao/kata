package com.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
    @Test
    public void should_1_inch_equals_to_1_inch() {
        assertEquals(new Length(1, Unit.Inch), new Length(1, Unit.Inch));
    }

    @Test
    public void should_display_internal_information_friendly() {
        assertEquals("1 (Inch)", new Length(1, Unit.Inch).toString());
        assertEquals("1 (Foot)", new Length(1, Unit.Foot).toString());
        assertEquals("1 (Yard)", new Length(1, Unit.Yard).toString());
    }

    @Test
    public void should_1_foot_equals_to_12_inches() {
        assertEquals(new Length(12, Unit.Inch), new Length(1, Unit.Foot));
    }

    @Test
    public void should_1_yard_equals_to_3_feet() {
        assertEquals(new Length(3, Unit.Foot), new Length(1, Unit.Yard));
    }

}
