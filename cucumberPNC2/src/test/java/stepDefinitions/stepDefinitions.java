package stepDefinitions;

import io.cucumber.junit.Cucumber;
import objDriver.objDriver;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pageObject.finish;
import pageObject.pageCheckout;
import pageObject.pageLogin;
import pageObject.pageProducts;

@RunWith(Cucumber.class)
public class stepDefinitions{
    WebDriver driver;
    objDriver oDriver;
    pageLogin page;
    pageCheckout pcheck;
    pageProducts pprod;
    finish f;

    @io.cucumber.java.en.Given("^Open Browser$")
    public void openBrowser() {
        oDriver = new objDriver(driver);
        oDriver.openBrowser();
    }

    @io.cucumber.java.en.When("^Enter url and click on Login button$")
    public void enterUrlAndClickOnLoginButton() {
        oDriver.pageSauce();

    }

    @io.cucumber.java.en.Then("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterAnd(String username, String password) throws Throwable {
        page = new pageLogin(driver);
        String xElemet;

        xElemet = page.userName();
        oDriver.sendKeys(xElemet,username);

        xElemet = page.password();
        oDriver.sendKeys(xElemet,password);

        xElemet = page.button();
        oDriver.Click(xElemet);
    }

    @io.cucumber.java.en.And("^Click on Login button$")
    public void clickOnLoginButton() {
        pprod = new pageProducts(driver);
        String idElement;

        idElement = pprod.tShirt();
        oDriver.Click2(idElement);

        idElement = pprod.cart();
        oDriver.Click2(idElement);

        idElement = pprod.checkout();
        oDriver.Click2(idElement);
    }

    @io.cucumber.java.en.Then("^Go to Virtual Wallet$")
    public void goToVirtualWallet() {
        pcheck = new pageCheckout(driver);
        String cElement;

        cElement = pcheck.holderName();
        oDriver.sendKeys(cElement, "charlie");

        cElement = pcheck.holderLName();
        oDriver.sendKeys(cElement, "gallardo");

        cElement = pcheck.zipcode();
        oDriver.sendKeys(cElement, "12345");

        cElement = pcheck.next();
        oDriver.Click(cElement);
    }

    @io.cucumber.java.en.And("^CLose Session$")
    public void closeSession() {
        f = new finish(driver);
        String xElement;

        xElement = f.bfinish();
        oDriver.Click(xElement);

        oDriver.close();
    }
}
