package org.example.tests.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {

    @Test(priority = 1)
    public void testCreateBookingSample()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void testVerifyBookingIdSample()
    {
        Assert.assertTrue(true);
    }
    @Test(priority = 3)
    public void testupdateBookingSample()
    {
        Assert.assertTrue(true);
    }

    @Test(priority = 4)
    public void testdeleteBookingSample()
    {
        Assert.assertTrue(true);
    }


}
