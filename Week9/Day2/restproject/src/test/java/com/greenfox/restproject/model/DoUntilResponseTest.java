package com.greenfox.restproject.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoUntilResponseTest {

    @Test
    public void sum() {
        DoUntilResponse dou = new DoUntilResponse();
        assertEquals(15, dou.sum(5));
    }

    @Test
    public void factor() {
        DoUntilResponse dou = new DoUntilResponse();
        assertEquals(120, dou.factor(5));
    }
}