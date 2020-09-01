package tests;

import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;


class GoogleTests extends TestBase {

    @Test
    void positiveSelenideSearchTest() {
        // Open google
        open("https://google.com");

        // Type Selenide in search
        $(byName("q")).setValue("Selenide").pressEnter(); // кнопка логина

        // Make sure the Selenide appears in search results
        $("#rso").shouldHave(text("selenide.org"));
    }
}