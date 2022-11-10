package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    @FindBy(xpath = "//button[@class='button nav__item active']")
    public WebElement viewAllOrder;

    @FindBy(xpath = "//button[normalize-space()='View all products']")
    public WebElement viewAllProducts;

    @FindBy(xpath = "//button[text()='Order']")
    public WebElement orderButton;


    @FindBy(xpath = "//button[@class='button __logout']")
    public WebElement logoutButton;

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
