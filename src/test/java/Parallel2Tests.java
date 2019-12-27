package com.jobtoday.tests.parallel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("parallel")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class Parallel2Tests {

    @Test
    @Tag("second")
    @DisplayName("Second test")
    void secondTest() {
        System.out.println("Second test");
        assertTrue(true);
    }
}