package com.greenfox;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class TaskTest {
    @Test
    public void isCompleted() throws Exception {
        Task t = new Task("nev", 1, LocalDateTime.parse("2017-10-21T12:00"));
        t.setCompletedAt(LocalDateTime.parse("2017-10-21T19:06:07.263"));
        assertTrue(t.isCompleted());
    }

}