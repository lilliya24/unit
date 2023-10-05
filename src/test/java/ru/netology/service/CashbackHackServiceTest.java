package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();

        int Amount = 1900;
        int expected = 100;
        int actual = service.remain(Amount);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemain1() {

        CashbackHackService service = new CashbackHackService();
        int Amount = 1000;
        int expected = 0;
        int actual = service.remain(Amount);
        assertEquals(actual, expected);

    }
}