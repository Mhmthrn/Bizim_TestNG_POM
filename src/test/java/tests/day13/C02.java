package tests.day13;

import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02 {


    QdPage qdPage=new QdPage();

    @Test
    public void kontrolTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        //  https://www.qualitydemy.com
        // dogru  kullanici adi ve sifresi ile  giris yapin giris yapildigini test eden ve fotograf cekin
        // Categories bolumunde bulunan -->IT-Software-->Microsoft Certification bolumlerini secin

        // Categories bolumdeki basliklar dan  DISNEY MAGIC ENGLISH bulumunu secip DISNEY MAGIC ENGLISH kursunun
        // ucretinin $400 dan daha yukdek oldugunu test edin ve ekran goruntusunu alin

        // son olarak compera bolumune tiklayarak acilan ekranda birinci secim alanina Java Kursu ikinci secim alanina da Piano
        // ekran goruntusunu alin
        // Java Kursunun egitim seviyesinin Intermediate oldugunu test edin.


    }

}
