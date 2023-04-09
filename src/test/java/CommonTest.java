import org.junit.Test;

public class CommonTest extends Main {

    public final static String BASE_URL = "http://localhost:8080/";

    @Test // ТЕСТ КОТОРЫЙ ПРОБЕГАЕТСЯ ПО ВКЛАДКАМ ИГРЫ
    public void firstTest() throws InterruptedException {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.goThroughTabs();
    }

    @Test // ПРОВЕРКА ВКЛ/ВЫКЛ ТЕМНОЙ ТЕМЫ CITY
    public void themeCityTest() throws InterruptedException {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.blackThemeOnAndOffCity();
    }

    @Test // ПРОВЕРКА ВКЛ/ВЫКЛ ТЕМНОЙ ТЕМЫ BUILDING
    public void themeBuildingTest() throws InterruptedException {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.blackThemeOnAndOffBuilding();
    }

    @Test // ПРОВЕРКА ВКЛ/ВЫКЛ ТЕМНОЙ ТЕМЫ SETTINGS
    public void themeSettingsTest() throws InterruptedException {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.blackThemeOnAndOffSettings();
    }

    @Test // ПРОВЕРКА ВКЛ/ВЫКЛ ТЕМНОЙ ТЕМЫ HOW TO PLAY
    public void themeHowToPlayTest() throws InterruptedException {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.blackThemeOnAndOffHowToPlay();
    }

    @Test // ПРОВЕРКА ВКЛ/ВЫКЛ ТЕМНОЙ ТЕМЫ DISCORD
    public void themeDiscordTest() throws InterruptedException {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.blackThemeOnAndOffDiscord();
    }

    //////////////////////////////  ТЕСТЫ ЗВУКОВЫХ НАСТРОЕК \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

    @Test // ПРОВЕРКА РАБОТОСПОСОБНОСТИ КЛАВИШИ "ЗВУКОВЫЕ НАСТРОЙКИ
    public void soundButtonWorks() throws InterruptedException {
        BasePage basePage = new BasePage(BASE_URL);
        basePage.soundSettingsButtonWorks();
    }
}