package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductStorePage {
    public static final Target BTN_SIGN_UP = Target.the("button to log in")
            .locatedBy("//*[@id='signin2']");

}
