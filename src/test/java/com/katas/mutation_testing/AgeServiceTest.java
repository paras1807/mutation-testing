package com.katas.mutation_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeServiceTest {

    @Test
    public void testIsAdult() {
        AgeService service = new AgeService();
        assertTrue(service.isAdult(21));
    }

    @Test
    public void testIsAdult2() {
        AgeService service = new AgeService();
        assertFalse(service.isAdult(17));
    }
}
