package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.ui.Link;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;
import starter.pageobjects.SignupPage;

import java.util.concurrent.LinkedBlockingQueue;

public class LoginStepDefinitions {

    @Given("{actor} is not a registered player")
    public void isNotARegisteredPlayer(Actor actor) {
        actor.attemptsTo(
                Open.url("http://localhost:5173")
        );
    }

    @When("{actor} tries to login but doesn't have an account")
    public void triesToLoginButDoesntHaveAnAccount(Actor actor) {
        actor.attemptsTo(
                Click.on(Link.withText("Create Account"))
        );
    }

    @Then("{actor} should be able to access the New Account page")
    public void sheShouldBeAbleToAccessTheNewAccountPage(Actor actor) {
        actor.attemptsTo(
                Ensure.that(SignupPage.PAGE_TITLE).hasText("Sign up")
        );
    }
}
