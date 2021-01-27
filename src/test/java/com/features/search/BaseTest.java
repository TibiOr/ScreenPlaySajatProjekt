package com.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {
    Actor user = Actor.named("User");

    @Managed(uniqueSession = true)
    public WebDriver theBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        user.can(BrowseTheWeb.with(theBrowser));
    }
}
