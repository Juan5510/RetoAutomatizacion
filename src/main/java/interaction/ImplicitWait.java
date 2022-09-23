package interaction;

import drivers.DriverRemoteBrowser;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.concurrent.TimeUnit;

public class ImplicitWait implements Interaction {


    private int secs;

    public ImplicitWait(int secs) {
        this.secs = secs;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        DriverRemoteBrowser.driver.manage().timeouts().implicitlyWait(secs, TimeUnit.MINUTES);

    }
    public static ImplicitWait on(int secs){
        return Instrumented.instanceOf(ImplicitWait.class).withProperties(secs);

    }
}
