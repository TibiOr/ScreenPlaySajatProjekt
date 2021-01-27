package com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import com.ui.GoogleSearchPage;

public class OpenGoogle implements Task {

    GoogleSearchPage googleSearchPage;

    @Step("Open the Google homepage")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(googleSearchPage)
        );
    }
}
