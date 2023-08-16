import StepObject.LoginSteps;
import Utils.ChromeRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static DataObject.LoginData.*;

public class LogIn extends ChromeRunner {

    @Test

    public void LogInWithInvalidData() throws InterruptedException {

        LoginSteps step1 = new LoginSteps(driver);

        step1.emailinput(invalidEmailData);
        step1.passwordinput(invalidPasswordData);
        step1.loginButton();
       Thread.sleep(5000);

    }

    @Test

    public void logInWithValidEmail() throws InterruptedException {


        LoginSteps step2 = new LoginSteps(driver);

        step2.emailinput(validEmailData);
        step2.passwordinput(invalidPasswordData);
        step2.loginButton();

        Thread.sleep(5000);

    }

}
