package pageObject;

import org.openqa.selenium.WebDriver;

public class pageLogin {
    WebDriver driver;
    public pageLogin(WebDriver driver){
        this.driver=driver;
    }

    public String userName(){

        String username;
        username="//input[@id='user-name']";
        return username;
    }

    public String password(){

        String password;
        password="//input[@id='password']";
        return password;
    }

    public String button(){

        String button;
        button="//input[@id='login-button']";
        return button;
    }


}
