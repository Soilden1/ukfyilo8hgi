import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class sabytest {

    @Test
    void test() {
        Configuration.baseUrl = "https://test-online.sbis.ru/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;

        // Открыть главную страницу СБИС
        open("https://test-online.sbis.ru/");
    }
}
