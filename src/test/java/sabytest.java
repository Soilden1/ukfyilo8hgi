import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class sabytest {

    @Test
    void test() {
        Configuration.baseUrl = "https://www.wikipedia.org/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;

        // Открыть главную страницу wiki
        open("https://www.wikipedia.org/");
    }
}
