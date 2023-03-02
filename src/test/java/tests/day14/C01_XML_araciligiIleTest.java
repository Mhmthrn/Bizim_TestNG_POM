package tests.day14;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_XML_araciligiIleTest {

    @Test
    public void girisTesti() throws IOException {
        QdPage qdPage=new QdPage();
        Actions actions=new Actions(Driver.getDriver());
        //  https://www.qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        // login butonuna tiklayin dogru  kullanici adi ve sifresi ile  giris yapin fotograf cekin
        qdPage.ilkLoginLinki.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButonuoncesiCookie.click();
        ReusableMethods.bekle(2);
        qdPage.loginButonu.click();
        ReusableMethods.bekle(1);

        ReusableMethods.getScreenshot("GirisSayfasiSs");

        // categories alaninda all courses bolumunu secin
        qdPage.categoriesIcon.click();
        qdPage.allCoursesSecenegi.click();
        ReusableMethods.bekle(2);

        actions.scrollToElement(qdPage.scrollKonumu);
        ReusableMethods.bekle(1);


        // acilan sayfada ilk olarak IT & Software alani ve ucret bolumunde Free secilecek Level intermediate secilsin
        qdPage.ITSoftware2.click();
        ReusableMethods.bekle(1);
        qdPage.ucret.click();
        ReusableMethods.bekle(1);
        qdPage.secilenKursSeviye.click();
        // listenen kursun seviyesisnsn intermedite oldugunu test edin
        SoftAssert softAssert=new SoftAssert();
        String expectedSeviye="intermedite";
        String  actualSeviye=Driver.getDriver().findElement((By) qdPage.listelenenKursSeviye).getText();

        softAssert.assertEquals(actualSeviye,expectedSeviye);
        softAssert.assertAll();
        Driver.closeDriver();

    }



    // kursa tiklayin get enroll tiklayin secimin basarili oldugunu test edin

}
