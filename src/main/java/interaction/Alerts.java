package interaction;

import drivers.DriverRemoteBrowser;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.Alert;

public class Alerts implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Alert alert = DriverRemoteBrowser.driver.switchTo().alert();
    }

    public static Alerts on(){
        return Instrumented.instanceOf(Alerts.class).withProperties();
    }
}
