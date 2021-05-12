package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void shouldIfAmountLess() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountEqualBoundary() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountOver() {
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountLessBoundary() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountOverBoundary() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }
}