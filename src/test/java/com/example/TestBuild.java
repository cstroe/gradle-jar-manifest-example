package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBuild {
    @Test
    public void test() {
        assertEquals("gradle-jar-manifest-example", BuildConfig.NAME);
        assertEquals("0.0.1", BuildConfig.VERSION);
    }
}
