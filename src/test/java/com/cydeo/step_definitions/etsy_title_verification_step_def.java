package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class etsy_title_verification_step_def {
    @Given("user is on Etsy page")
    public void user_is_on_etsy_page() {
        Driver.getDriver().get("https://www.etsy.com ");

    }
    @Then("User sees title  as expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_sees_title_as_expected_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Given("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

        searchBox.sendKeys("Wooden Spoon"+ Keys.ENTER);

    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Wooden spoon - Etsy";

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("User types {string} in the search box")
    public void user_types_in_the_search_box(String searchKeyword) {
        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

        searchBox.sendKeys(searchKeyword+ Keys.ENTER);

    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
