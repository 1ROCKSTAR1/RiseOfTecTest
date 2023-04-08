import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideTargetLocator;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SettingsPage {

    private final SelenideElement settings = $x("//*[@onclick=\"openTab(event, 'Settings')\"]");
    private final SelenideElement themeButton = $x("//*[@id=\"btnColorMode\"]");
    private final SelenideTargetLocator themeConditionWhite = (SelenideTargetLocator) $x("//*[@style=\"background-color: white;\"]").shouldBe(Condition.exist);
    private final SelenideTargetLocator themeConditionWhite2 = (SelenideTargetLocator) $x("//*[@style=\"background-color: white;\"]");
    private final SelenideTargetLocator themeConditionBlack = (SelenideTargetLocator) $x("//*[@style=\"background-color: black;\"]").shouldBe(Condition.exist);
    private final SelenideTargetLocator themeConditionBlack2 = (SelenideTargetLocator) $x("//*[@style=\"background-color: black;\"]");


    public SettingsPage(String url) {
        Selenide.open(url);
    }

    public void blackThemeOnAndOff() throws InterruptedException {
        Thread.sleep(1000);
        settings.click();
        Thread.sleep(1000);
        themeButton.click();
//        Assert.assertSame(themeConditionWhite,themeConditionWhite2);
//        Thread.sleep(1000);
//        themeButton.click();
//        Assert.assertSame(themeConditionBlack,themeConditionBlack2);



    }
}
