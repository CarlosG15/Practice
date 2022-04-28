package pageObject;

import org.openqa.selenium.WebDriver;

public class finish {
    WebDriver driver;

    public finish(WebDriver driver){
        this.driver = driver;
    }

    public String bfinish(){

        String bfinish;
        bfinish="//button[@id='finish']";
        return bfinish;
    }
}
