package owner.config;

import org.aeonbits.owner.Config;
import owner.heplers.Browser;

import java.net.URL;

@Config.Sources("classpath:config/${env}.properties")
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://hh.ru")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    // зачитываем данные из командной строки
    @Key("remoteUrl")
    // обрабатывает дефолтное значение
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub/")
    // конвертируем в возращаемый тип
    String getRemoteUrl();

   // @Key("remoteWebDriver")
   // String getRemoteWebDriver();

    @Key("browserSize")
    @DefaultValue("100")
    String getBrowserSize();

    @Key ("browserVersion")
    @DefaultValue("100")
    String getBrowserVersion();
}
