package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.ProductStorePage.BTN_SIGN_UP;
import static userinterfaces.ProductStoreSignUp.*;

public class SignUp implements Task {

    String user;
    String password;


    public static SignUp thePage() {
        return Tasks.instrumented(SignUp.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_SIGN_UP, isVisible()).forNoMoreThan(3).seconds(),
                JavaScriptClick.on(BTN_SIGN_UP),
                Enter.theValue(user).into(Campo_Texto_Username),
                Enter.theValue(password).into(Campo_Texto_Password),
                JavaScriptClick.on(Enter_SignUp)



        );

    }

    public SignUp withThisUser(String user) {
        this.user = user;
        return this;
    }

    public SignUp andThisPassword(String password) {
        this.password = password;
        return this;
    }
}
