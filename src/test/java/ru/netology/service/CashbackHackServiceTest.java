package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemainWhenLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(850);
        Assert.assertEquals(actual, 150);
    }

    @Test
    public void shouldRemainWhenMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1100);
        Assert.assertEquals(actual, 900);
    }

    @Test
    public void shouldNotRemainWhenEquallyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        Assert.assertEquals(actual, 0);
    }
}