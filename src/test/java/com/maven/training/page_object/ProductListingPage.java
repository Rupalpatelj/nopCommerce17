package com.maven.training.page_object;

import com.maven.training.driver.DriverHelpers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductListingPage extends DriverHelpers {

    @FindBy(css = ".ac-product-card__name")
    private List<WebElement> allProductList;

    public void selectProduct(String product){
        allProductList.get(0).click();
    }
}
