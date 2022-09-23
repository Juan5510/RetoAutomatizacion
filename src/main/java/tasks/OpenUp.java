package tasks;

import model.InfoRegistroProductStore;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import userinterfaces.ProductStorePage;

public class OpenUp implements Task {

    public static WebDriver driver;
    private String url;

    public OpenUp(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        driver.get(url);

    }

    public static SignUp thePage(String url) {
        return Tasks.instrumented(SignUp.class, url);

    }
}
