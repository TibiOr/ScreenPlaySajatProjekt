package com.tasks;

import com.ui.AutomationPracticePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenAutomationPractice implements Task {

    AutomationPracticePage automationPracticePage;

    @Step("Open the AutomationPractice homepage")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(automationPracticePage)
        );

    }
}
