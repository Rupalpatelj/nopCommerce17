package com.maven.training.page_object;

import com.maven.training.driver.DriverHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverHelpers {

    @FindBy(id = "searchTerm")
   private WebElement searchBox;

    public String isOnHomePage() {
        return driver.getCurrentUrl();
    }

    public void searchProduct(String searchTerm) {
        searchBox.sendKeys(searchTerm);
        searchBox.sendKeys(Keys.ENTER);
    }
}
