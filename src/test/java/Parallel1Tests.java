package com.jobtoday.tests.parallel;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("parallel")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class Parallel1Tests {

    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test");
        assertTrue(true);
    }
}