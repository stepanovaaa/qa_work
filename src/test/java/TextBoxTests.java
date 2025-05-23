import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver137/chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Oleg Mishin");
        $("#userEmail").setValue("oleg2022@mishin.org");
        $("#currentAddress").setValue("Adress 1");
        $("#permanentAddress").setValue("Adress another2");
        $("#submit").click();

        $("#output").shouldHave(text("Oleg Mishin"), text("oleg2022@mishin.org"), text("Adress 1"), text("Adress another2"));
    }
}
