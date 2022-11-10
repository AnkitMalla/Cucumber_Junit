package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class wiki_search_step_definition {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();
    @Given("User is on wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {

        wikiSearchPage.searchbox.sendKeys("Steve Jobs");

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
wikiSearchPage.searchBtn.click();
    }
    @Then("User sees Steve Jobs in the wiki title")
    public void user_sees_steve_jobs_in_the_wiki_title() {
        String expected = "Steve Jobs";
        String actual= Driver.getDriver().getTitle();

        Assert.assertTrue(actual.contains(expected));

    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchKeyword) {
        wikiSearchPage.searchbox.sendKeys(searchKeyword);
    }
    @Then("User sees {string} in the wiki title")
    public void user_sees_in_the_wiki_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }

}
