package questions;

import drivers.DriverRemoteBrowser;
import interaction.ExplicitWait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.Alert;

import static userinterfaces.ProductStoreSignUp.Enter_SignUp;

public class IsLogged implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        Alert alert = DriverRemoteBrowser.driver.switchTo().alert();

        return alert.getText();
    }
    public static Question<String> value(){


        return new IsLogged();
    }
}
