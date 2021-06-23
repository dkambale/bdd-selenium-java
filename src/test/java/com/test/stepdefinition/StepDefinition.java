package com.test.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver=null;
    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://www.thetestingworld.com/index.php?option=com_users&view=login&Itemid=587");
        driver.manage().window().maximize();
        //driver.findElement(By.className("item-587 current active")).click();
    }

    @When("^user enter userName$")
    public void user_enter_userName() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("username")).sendKeys("Dadasaheb");
    }

    @When("^user password$")
    public void user_password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^click on sign$")
    public void click_on_sign() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^User should be logged in$")
    public void user_should_be_logged_in() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^User click on Logout Button$")
    public void user_click_on_Logout_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
