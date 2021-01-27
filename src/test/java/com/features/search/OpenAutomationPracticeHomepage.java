package com.features.search;

import com.tasks.OpenAutomationPractice;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.containsString;


public class OpenAutomationPracticeHomepage extends BaseTest {

    @Steps
    OpenAutomationPractice openAutomationPractice;

    @Test
    public void onOpeningAutomationPracticeUserShouldSeeTitle() {
        givenThat(user).wasAbleTo(openAutomationPractice);
        then(user).should(eventually(seeThat(TheWebPage.title(), containsString("My Store"))));
    }
}
