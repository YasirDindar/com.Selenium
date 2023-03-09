package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Set;

public class WebUniversitystepdefinitions {


    WebUniversityPage webUniversityPage = new WebUniversityPage();
    String ilkSayfaHandleDegeri ;

    @Then("Login Portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortalButonu.click();
    }
    @Then("Yeni window’a gecer")
    public void yeni_window_a_gecer() {
        //eger yeni window'a geciyorsa, yeni window acilmadan ilk sayfanin WHD kaydetmeliyiz

        Set<String> windowHandlesSeti = Driver.getDriver().getWindowHandles();
        String ikinciSayfaWHD ="";

        for (String each:windowHandlesSeti
             ) {
            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaWHD =each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaWHD);
    }
    @And("username kutusuna deger yazar")
    public void usernameKutusunaDegerYazar() {
        webUniversityPage.userNameKutusu.sendKeys("Yasir");

    }
    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {
        webUniversityPage.passwordKutusu.sendKeys("123456");
    }
    @Then("webunuversity login butonuna basar")
    public void webunuversity_login_butonuna_basar() {
        webUniversityPage.loginButonu.click();
    }
    @Then("Popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {
        String actualAlertYazisi=Driver.getDriver().switchTo().alert().getText();
        String expectedAlertYazisi ="validation failed";

        Assert.assertTrue(actualAlertYazisi.contains(expectedAlertYazisi));
    }
    @Then("Ok diyerek Popup’i kapatir")
    public void ok_diyerek_popup_i_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("Ilk sayfaya geri donun")
    public void ilk_sayfaya_geri_donun() {
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
    }
    @Then("Ilk sayfaya donuldugunu test edin")
    public void ilk_sayfaya_donuldugunu_test_edin() {
        String actualIlkSayfaUrl = Driver.getDriver().getCurrentUrl();
        String  expectedIlkSayfaUrl = ConfigReader.getProperty("wduUrl");

        Assert.assertEquals(actualIlkSayfaUrl,expectedIlkSayfaUrl);
    }


    @And("tum acilan sayfalari kapatir")
    public void tumAcilanSayfalariKapatir() {
        Driver.quitDrover();
    }
}
