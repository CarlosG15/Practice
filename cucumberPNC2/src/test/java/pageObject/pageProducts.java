package pageObject;

import org.openqa.selenium.WebDriver;

public class pageProducts {
    WebDriver driver;

    public pageProducts(WebDriver driver){
        this.driver = driver;
    }

    public String tShirt(){
        String tshirt;
        tshirt="add-to-cart-sauce-labs-bolt-t-shirt";
        return tshirt;
    }

    public String cart(){
        String cart;
        cart="shopping_cart_container";
        return cart;
    }

    public String checkout(){
        String check;
        check = "checkout";
        return check;
    }
}
