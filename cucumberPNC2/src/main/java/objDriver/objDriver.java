package objDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class objDriver {

    private WebDriver driver;
    public String URL;
    public WebDriverWait objWait;

    public objDriver(WebDriver driver) {
        this.driver = driver;
        URL="https://www.saucedemo.com/";
    }

    public WebDriver openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\carlos.gallardo\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    public WebDriver pageSauce(){
        driver.get(URL);
        return driver;
    }

    public void credentials(final String strLocator){
        objWait = new WebDriverWait(driver, 10);
        objWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(strLocator)));
    }

    public WebElement vWallet(final String strLocator, String fValue){
        try {
            driver.switchTo().frame(fValue);
            WebElement wallet = driver.findElement(By.xpath(strLocator));
            return wallet;
        }
        catch (Exception wallet){
            System.out.println("WebElement is not recognized");
            return null;
        }
    }

    public boolean Click(final String strLocator){
        WebElement clickable;
        objWait = new WebDriverWait(driver, 10);
        clickable = objWait.until(ExpectedConditions.elementToBeClickable(By.xpath(strLocator)));
        clickable.click();
        return true;
    }

    public boolean Click2(final String strLocator){
        WebElement clickable;
        objWait = new WebDriverWait(driver, 10);
        clickable = objWait.until(ExpectedConditions.elementToBeClickable(By.id(strLocator)));
        clickable.click();
        return true;
    }

    public boolean sendKeys(final String strLocator, String kValue){
        WebElement keys;
        objWait = new WebDriverWait(driver, 10);
        keys = objWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strLocator)));
        keys.clear();
        keys.sendKeys(kValue);
        return true;
    }

    public void close(){
        driver.close();
        driver.quit();
    }

}
