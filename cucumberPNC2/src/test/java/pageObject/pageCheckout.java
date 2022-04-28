package pageObject;

import org.openqa.selenium.WebDriver;

public class pageCheckout {
    WebDriver driver;

    public pageCheckout(WebDriver driver){
        this.driver = driver;
    }

    public String holderName(){
        String name;
        name = "//input[@id='first-name']";
        return name;
    }

    public String holderLName(){
        String lName;
        lName = "//input[@id='last-name']";
        return lName;
    }

    public String zipcode(){
        String zip;
        zip = "//input[@id='postal-code']";
        return zip;
    }

    public String next(){
        String next;
        next = "//input[@id='continue']";
        return next;
    }
}
