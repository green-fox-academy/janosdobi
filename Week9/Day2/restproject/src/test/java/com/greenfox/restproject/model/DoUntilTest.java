package com.greenfox.restproject.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoUntilTest {

    @Test
    public void sum() {
        DoUntil dou = new DoUntil();
        assertEquals(15, dou.sum(5));
    }

    @Test
    public void factor() {
        DoUntil dou = new DoUntil();
        assertEquals(120, dou.factor(5));
    }
}