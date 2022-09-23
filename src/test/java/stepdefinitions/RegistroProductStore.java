package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import drivers.DriverRemoteBrowser;
import model.InfoRegistroProductStore;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.IsLogged;
import tasks.SignUp;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static util.Global.URL;


public class RegistroProductStore{

        @Before
        public void iniciarEscenario(){
                OnStage.setTheStage(new OnlineCast());
        }


        @Given("^Juan  quiere registrarse en la pagina Product Store$")
        public void juanQuiereRegistrarseEnLaPaginaProductStore()  {
                DriverRemoteBrowser.withTheseOptions();
                OnStage.theActorCalled("Juan").can(BrowseTheWeb.with(DriverRemoteBrowser.on(URL)));
        }
        @When("^ingrese toda la informacion requerida$")
        public void ingreseTodaLaInforamcionRequerida(List<InfoRegistroProductStore> datos)  {
                OnStage.theActorInTheSpotlight().attemptsTo(
                        SignUp.thePage()
                                .withThisUser(datos.get(0).getStrNombre())
                                .andThisPassword(datos.get(0).getStrContrasena())
                                );


        }

        @Then("^se completa el registro de manera exitosa (.*)$")
        public void seCompletaElRegistroDeManeraExitosa(String text) {
                OnStage.theActorInTheSpotlight().should(seeThat(IsLogged.value(), equalTo(text)));


        }
}
