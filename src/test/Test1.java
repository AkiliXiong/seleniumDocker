package test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.impl.WebDriverContainer;
import com.codeborne.selenide.impl.WebDriverThreadLocalContainer;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Test1 {
    @Test
    public void testMethod1() throws InterruptedException {
        WebDriverContainer webDriverContainer = new WebDriverThreadLocalContainer();
        Configuration.screenshots=false;
        webDriverContainer.clearBrowserCache();
        Configuration.browser="chrome";
        Configuration.remote="http://192.168.3.4:5001/wd/hub";
        String baseUrl = "http://www.baidu.com";
        com.codeborne.selenide.Selenide.open(baseUrl);
        $(byText("百度")).should(Condition.visible);
        Thread.sleep(3000);
    }
}
