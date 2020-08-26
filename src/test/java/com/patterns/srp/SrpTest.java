package com.patterns.srp;

import com.patterns.BaseTest;
import org.testng.annotations.Test;

public class SrpTest extends BaseTest {

    @Test
    public void testLaunch(){
        this.driver.get("https://www.google.com/");
    }

}
