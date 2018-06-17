package com.maven.training.step_def;

import com.maven.training.page_object.HomePage;
import com.maven.training.page_object.ProductListingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.endsWith;

public class TrollyStepDef {

    private HomePage homePage = new HomePage();
    ProductListingPage productListingPage = new ProductListingPage();

    @Given("^I on homepage$")
    public void i_on_homepage() {
        String expected = homePage.isOnHomePage();
//        Assert.assertTrue(expected.endsWith("/co.uk"));
        assertThat(expected, endsWith("co.uk/"));
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String searchTerm) {
        homePage.searchProduct(searchTerm);
    }

    @When("^I select a product \"([^\"]*)\"$")
    public void i_select_a_product(String product) {
        productListingPage.selectProduct(product);
    }

    @When("^I add product to trolly$")
    public void i_add_product_to_trolly() {
    }

    @When("^I go to trolly$")
    public void i_go_to_trolly() {
    }

    @Then("^I should see \"([^\"]*)\" in trolly$")
    public void i_should_see_in_trolly(String expectedProduct) {
    }
}
