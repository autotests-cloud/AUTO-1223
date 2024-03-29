package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Github search")
    void generatedTest() {
        step("Open \"https://github.com/\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Focus search window", () -> {
            step("// todo: just add selenium action");
        });

        step("Enter 'allure'", () -> {
            step("// todo: just add selenium action");
        });

        step("Press Enter", () -> {
            step("// todo: just add selenium action");
        });

        step("Verify that a page has 'allure' text", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://github.com/'", () ->
            open("https://github.com/"));

        step("Page title should have text 'GitHub: Where the world builds software · GitHub'", () -> {
            String expectedTitle = "GitHub: Where the world builds software · GitHub";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://github.com/'", () ->
            open("https://github.com/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}