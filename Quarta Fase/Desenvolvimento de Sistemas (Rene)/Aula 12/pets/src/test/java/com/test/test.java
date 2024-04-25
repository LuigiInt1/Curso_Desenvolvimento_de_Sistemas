package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;



public class test  {

    protected double fValue1 = 2.0;
    protected double fValue2 = 3.0;



    @Test
    public void testAdd(){
        assertEquals(fValue1 + fValue2, 5.0);
    }

}
