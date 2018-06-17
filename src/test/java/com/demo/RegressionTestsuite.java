package com.demo;

import com.demo.page_object.HomePage;
import org.junit.*;

public class RegressionTestsuite extends BaseTest {

    HomePage homePage=new HomePage();

    @Test
    public void basketTest() {
        homePage.doSearch("nike");
    }


    @Test
    public void searchTest() {
        homePage.doSearch("puma");
        Assert.assertTrue(homePage.getHomePageCurrentURl().endsWith("nike"));
    }

}
