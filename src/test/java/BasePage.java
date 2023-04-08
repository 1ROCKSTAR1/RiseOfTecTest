import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideTargetLocator;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    public BasePage(String url) {
        Selenide.open(url);
    }

    public void goThroughTabs() throws InterruptedException, RuntimeException {
        Thread.sleep(2000);
        Locators.buildingButton.click();
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.howToPlay.click();
        Thread.sleep(1000);
        Locators.discordButton.click();
        Thread.sleep(1000);
        Locators.cityButton.click();

    }
    public void blackThemeOnAndOffSettings() throws InterruptedException {
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        $x("//*[@id=\"btnColorMode\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"btnReg\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"btnLogin\"]").should(Condition.attribute( "style","margin-left: 20px; color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"btnRegLogin\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"buttonExportGame\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"buttonImportGame\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"btnSoundSettings\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"buttonImportGame\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));

        $x("//*[@id=\"buttonSaveToCloud\"]").should(Condition.attribute("style","margin-bottom: 20px; margin-top: 15px; color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"buttonLoadFromCloud\"]").should(Condition.attribute("style","margin-left: 30px; margin-bottom: 20px; margin-top: 15px; color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));


        $x("//*[@id=\"login\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"password\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"email\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        //$x("//*[@id=\"selectLng\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@id=\"savestring\"]").should(Condition.attribute( "style","width: 600px; color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));

        $x("//*[@class=\"menu-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));
        $x("//*[@class=\"resource-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64); background-color: black;"));
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));
        $x("//*[@class=\"info-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));


        Thread.sleep(1000);
        Locators.themeButton.click();
        $x("//*[@id=\"btnColorMode\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"btnColorMode\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"btnReg\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        //$x("//*[@id=\"btnLogin\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"btnRegLogin\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"buttonExportGame\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"buttonExportGame\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"buttonImportGame\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));

        $x("//*[@id=\"buttonSaveToCloud\"]").should(Condition.attribute("style","margin-bottom: 20px; margin-top: 15px; color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"buttonLoadFromCloud\"]").should(Condition.attribute("style","margin-left: 30px; margin-bottom: 20px; margin-top: 15px; color: black; background-color: rgb(241, 241, 241);"));


        $x("//*[@id=\"btnSoundSettings\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"buttonImportGame\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"login\"]").should(Condition.attribute( "style","color: black; background-color: white;"));
        $x("//*[@id=\"password\"]").should(Condition.attribute( "style","color: black; background-color: white;"));
        $x("//*[@id=\"email\"]").should(Condition.attribute( "style","color: black; background-color: white;"));
        //$x("//*[@id=\"selectLng\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@id=\"savestring\"]").should(Condition.attribute( "style","width: 600px; color: black; background-color: white;"));

        $x("//*[@class=\"menu-panel\"]").should(Condition.attribute( "style","color: black;"));
        $x("//*[@class=\"resource-panel\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: black;"));
        $x("//*[@class=\"info-panel\"]").should(Condition.attribute( "style","color: black;"));
    }

    public void blackThemeOnAndOffCity() throws InterruptedException {
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        Thread.sleep(1000);
        Locators.cityButton.click();
        $x("//*[@onclick=\"openTab(event, 'Main')\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@onclick=\"openTab(event, 'tabBuilding')\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@onclick=\"openTab(event, 'Settings')\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@onclick=\"openTab(event, 'About')\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));
        $x("//*[@onclick=\"openTab(event, 'Discord')\"]").should(Condition.attribute( "style","color: rgb(96, 96, 96); background-color: rgb(32, 32, 32);"));

        $x("//*[@class=\"menu-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));
        $x("//*[@class=\"resource-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64); background-color: black;"));
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));
        $x("//*[@class=\"info-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));

        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        Thread.sleep(1000);
        Locators.cityButton.click();

        $x("//*[@onclick=\"openTab(event, 'Main')\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@onclick=\"openTab(event, 'tabBuilding')\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@onclick=\"openTab(event, 'Settings')\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@onclick=\"openTab(event, 'About')\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@onclick=\"openTab(event, 'Discord')\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));

        $x("//*[@class=\"menu-panel\"]").should(Condition.attribute( "style","color: black;"));
        $x("//*[@class=\"resource-panel\"]").should(Condition.attribute( "style","color: black; background-color: rgb(241, 241, 241);"));
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: black;"));
        $x("//*[@class=\"info-panel\"]").should(Condition.attribute( "style","color: black;"));
    }

    public void blackThemeOnAndOffBuilding() throws InterruptedException {
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        Thread.sleep(1000);
        Locators.buildingButton.click();

        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        Thread.sleep(1000);
        Locators.buildingButton.click();
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: black;"));
    }

    public void blackThemeOnAndOffHowToPlay() throws InterruptedException {
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        Thread.sleep(1000);
        Locators.howToPlay.click();
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        Thread.sleep(1000);
        Locators.howToPlay.click();
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: black;"));
    }

    public void blackThemeOnAndOffDiscord() throws InterruptedException {
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        Thread.sleep(1000);
        Locators.discordButton.click();
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: rgb(64, 64, 64);"));
        Thread.sleep(1000);
        Locators.settingsButton.click();
        Thread.sleep(1000);
        Locators.themeButton.click();
        Thread.sleep(1000);
        Locators.discordButton.click();
        $x("//*[@class=\"content-panel\"]").should(Condition.attribute( "style","color: black;"));
    }

}
