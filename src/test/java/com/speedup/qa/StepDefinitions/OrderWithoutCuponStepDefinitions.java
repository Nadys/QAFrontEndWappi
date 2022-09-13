package com.speedup.qa.StepDefinitions;

import com.speedup.qa.models.LoginModels;
import com.speedup.qa.tasks.Login;
import com.speedup.qa.tasks.OpenBrowser;
import com.speedup.qa.tasks.OrderWithoutCupon;
import cucumber.api.java.Before;
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

public class OrderWithoutCuponStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Nadia Bustos");
    }
    @When("^she click on the button$")
    public void sheClickOnTheButton() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OrderWithoutCupon.orderWithoutCupon());
    }

    @Then("^it will select the order$")
    public void itWillSelectTheOrder() {

    }

}
