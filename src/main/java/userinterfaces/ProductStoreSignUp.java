package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductStoreSignUp {


    public static final Target Campo_Texto_Username = Target.the("Campo para que agregue el nombre").located(By.id("sign-username"));

    public static final Target Campo_Texto_Password = Target.the("Campo para que agregue la contraseña").located(By.id("sign-password"));

    public static final Target Enter_SignUp = Target.the("Validacion registro").locatedBy("//button[@onclick='register()']");
}
