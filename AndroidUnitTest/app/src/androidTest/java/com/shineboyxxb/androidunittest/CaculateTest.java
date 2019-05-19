package com.shineboyxxb.androidunittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaculateTest {

    private Caculate mCalculate;

    @Before
    public void setUp() throws Exception {
        mCalculate = new Caculate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sum() {
        assertEquals(6d, mCalculate.sum(1d, 5d), 0);
    }

    @Test
    public void substract() {
        assertEquals(2d, mCalculate.substract(4d, 2d), 0);
    }
}