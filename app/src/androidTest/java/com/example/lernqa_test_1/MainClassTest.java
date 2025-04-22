package com.example.lernqa_test_1;

import org.junit.Test;

public class MainClassTest {
    static int localNumber = 14;
    public int getLocalNumber() {
        return localNumber;
    }

    @Test
    public void testGetLocalNumber() {
        if (getLocalNumber() == localNumber) {
            System.out.println("Test succeed. The return value is 14.");
        } else {
            System.out.println("Test failed. The return value is not 14.");
        }
    }
}
