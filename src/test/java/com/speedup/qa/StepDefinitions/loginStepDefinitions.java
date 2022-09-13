package com.speedup.qa.StepDefinitions;

import com.speedup.qa.models.LoginModels;
import com.speedup.qa.tasks.Login;
import com.speedup.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Nadia Bustos");
    }
    @Given("^The Nadia join Wappi$")
    public void theNadiaJoinWappi() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }


    @When("^she enters the credential$")
    public void sheEntersTheCredential(List<LoginModels> loginModels) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withData(loginModels.get(0)));
    }

    @Then("^the user should see the name$")
    public void theUserShouldSeeTheName() {

    }

}
