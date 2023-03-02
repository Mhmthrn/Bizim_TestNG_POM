package tests.day14;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;

public class RaparlamaOrnegi extends TestBaseRapor {


    @Test(priority = 1)
    public void loginTest() throws InterruptedException, IOException {
        extentTest=extentReports.createTest("Pozitif Login Test","Sisteme basari ile giris yapilabilmeli.");
        QdPage qdPage=new QdPage();


         //  https://www.qualitydemy.com
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        // dogru  kullanici adi ve sifresi ile  giris yapin giris yapildigini test eden ve fotograf cekin
        qdPage.ilkLoginLinki.click();
        extentTest.info("ilk login linke tiklandi");
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        extentTest.info("email kutusuna tiklandi");
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        extentTest.info("password kutusuna tiklandi");
        qdPage.loginButonuoncesiCookie.click();
        Thread.sleep(2000);
        qdPage.loginButonu.click();
        Thread.sleep(1000);

        TakesScreenshot tSs= (TakesScreenshot) Driver.getDriver();

        File basariliSonuc= new File("target/basariliSonucER.png");

        File geciData=tSs.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(geciData,basariliSonuc);


        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());

        extentTest.pass("Sisteme basarili bir sekilde giris yapilmistir.");



    }



}
