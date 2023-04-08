import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Locators {
     public static SelenideElement buildingButton = $x("//*[@onclick=\"openTab(event, 'tabBuilding')\"]");
    public static SelenideElement settingsButton = $x("//*[@onclick=\"openTab(event, 'Settings')\"]");
    public static SelenideElement howToPlay = $x("//*[@onclick=\"openTab(event, 'About')\"]");
    public static SelenideElement discordButton = $x("//*[@onclick=\"openTab(event, 'Discord')\"]");
    public static SelenideElement cityButton = $x("//*[@onclick=\"openTab(event, 'Main')\"]");
    public static SelenideElement themeButton = $x("//*[@id=\"btnColorMode\"]");
    public static SelenideElement regButton = $x("//*[@id=\"btnReg\"]");
    public static SelenideElement loginButton = $x("//*[@id=\"btnLogin\"]");
    public static SelenideElement registerButton = $x("//*[@id=\"btnRegLogin\"]");
    public static SelenideElement exportSaveButton = $x("//*[@id=\"buttonExportGame\"]");
    public static SelenideElement importSaveButton = $x("//*[@id=\"buttonImportGame\"]");
    public static SelenideElement saveToCloudButton = $x("//*[@id=\"buttonSaveToCloud\"]");
    public static SelenideElement loadFromCloudButton = $x("//*[@id=\"buttonLoadFromCloud\"]");
    public static SelenideElement soundSettingsButton = $x("//*[@id=\"btnSoundSettings\"]");
    public static SelenideElement loginField = $x("//*[@id=\"login\"]");
    public static SelenideElement passField = $x("//*[@id=\"password\"]");
    public static SelenideElement emailField = $x("//*[@id=\"email\"]");
    public static SelenideElement selectLangField = $x("//*[@id=\"selectLng\"]");
    public static SelenideElement saveField = $x("//*[@id=\"savestring\"]");

    public static SelenideElement menuPanel = $x("//*[@class=\"menu-panel\"]");
    public static SelenideElement resoursePanel = $x("//*[@class=\"resource-panel\"]");
    public static SelenideElement contentPanel = $x("//*[@class=\"content-panel\"]");
    public static SelenideElement infoPanel = $x("//*[@class=\"info-panel\"]");
}
