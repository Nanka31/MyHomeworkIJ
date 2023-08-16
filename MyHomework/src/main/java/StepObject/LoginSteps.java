package StepObject;

import PageObject.LogInPage;
import org.openqa.selenium.WebDriver;

public class LoginSteps extends LogInPage {
WebDriver driver;

    public LoginSteps(WebDriver driver1){                //კონსტრუქტორი

        driver =  driver1;
    }

    public void emailinput (String e){
        driver.findElement(emailField).sendKeys(e);

    }

    public void passwordinput (String p) {
        driver.findElement(passwordField).sendKeys(p);

    }
    public void loginButton(){
        driver.findElement(logInButton).click();

    }
}
