package com.epam.enu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    private Main main;

    @Before
    public void setup() {
        main = new Main();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEntryMessage() {
        Assert.assertEquals("You can come in", main.getEntryMessageWithReader("BARSIK"));
        Assert.assertEquals("You can come in", main.getEntryMessageWithReader("SNEGOK"));
    }
}
