package com.example.volume;

import junit.framework.*;

public class VolumeMainTest extends TestCase{

    private int value1, value2;
    VolumeMain test;
    // assigning the values
    protected void setUp(){
        value1 = 3;
        value2 = 3;
        test = new VolumeMain(value1, value2);
    }

    // test method to add two values
    public void testAdd(){
        double result = value1 * value2;
        assertTrue(result == test.getResult());
    }

}










