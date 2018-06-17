package com.demo.page_object;

import com.demo.BaseTest;
import org.openqa.selenium.By;

public class HomePage extends BaseTest{

    public void doSearch(String searchTerm){
        driver.findElement(By.id("small-searchterms")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector(".search-box-button")).click();
    }

    public String getHomePageCurrentURl(){
        return driver.getCurrentUrl();
    }
}
