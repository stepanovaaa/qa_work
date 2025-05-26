import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver137/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments(
//                "--disable-dev-shm-usage",
//                "--no-sandbox",
                "--window-size=1920,1080",
                "--remote-allow-origins=*"
        );
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("Alex Egorov");
        $("#userEmail").setValue("alex@egorov.com");
        $("#currentAddress").setValue("Some address 1");
        $("#permanentAddress").setValue("Another address 1");
        $("#submit").click();

        $("#output").shouldHave(text("Alex Egorov"), text("alex@egorov.com"),
                text("Some address 1"), text("Another address 1"));
    }
}
