package com.epam.l2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Before
    public void setup() {

    }

    @Test
    public void testGetCount() {
        Assert.assertEquals((long) 30, (long) Main.getCount(15));
//        Assert.assertEquals("Самолет может не взлететь из-за некорректного веса", (long) 15, (long) Main.getCount(15));
        Assert.assertEquals(20L, (long) Main.getCount(10));
    }

    @Test
    public void testGetCount1() {
        Assert.assertEquals((long) 30, (long) Main.getCount(15));
//        Assert.assertEquals("Самолет может не взлететь из-за некорректного веса", (long) 15, (long) Main.getCount(15));
        Assert.assertEquals(20L, (long) Main.getCount(10));
    }

    @Test
    public void testGetCount2() {
        Assert.assertEquals((long) 30, (long) Main.getCount(15));
//        Assert.assertEquals("Самолет может не взлететь из-за некорректного веса", (long) 15, (long) Main.getCount(15));
        Assert.assertEquals(20L, (long) Main.getCount(10));
    }

    @After
    public void clean() {

    }
}
