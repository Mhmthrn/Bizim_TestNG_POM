package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {
    public QdPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Log in")
    public WebElement ilkLoginLinki;


    @FindBy(id = "login-email")
    public WebElement emailKutusu;

    @FindBy(id = "login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@id=\"cookieConsentContainer\"]/div[2]/a")
    public WebElement loginButonuoncesiCookie;


    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy(linkText = "Instructor")
    public WebElement basariliGirisElementi;



    @FindBy(xpath = "//span[text()='Categories']")
    public WebElement categoriesIcon;

    @FindBy(xpath = "//span[text()='IT & Software']")
    public WebElement itSoftware;


    @FindBy(linkText = "Microsoft Certification")
    public WebElement certification;

    @FindBy(xpath = " //label[@for='sub_category-8']")
    public WebElement disneyEnglish;

    @FindBy(xpath = " (//span[@class='current-price'])[2]")
    public WebElement dmeUcret;

    @FindBy(xpath = "(//button[@class='btn-compare-sm'])[1] ")
    public WebElement compare;

    @FindBy(xpath = " (//span[@class='select2-selection__placeholder'])[1]")
    public WebElement birincisecimalani;

    @FindBy(xpath = " (//span[@class='select2-selection__placeholder'])[2]")
    public WebElement ikincisecimalani;

    @FindBy(xpath = " /html/body/section[3]/div/div/div/div[5]/div[3]/text()")
    public WebElement seviye;

    @FindBy(xpath = "//span[text()='All courses']")
    public WebElement allCoursesSecenegi;

    @FindBy(xpath = "//label[@for='category-3']")
    public WebElement ITSoftware2;

    @FindBy(xpath = "/label[@for='price_free']")
    public WebElement ucret;

    @FindBy(xpath = "//label[@for='intermediate']")
    public WebElement secilenKursSeviye;

    @FindBy(xpath = "//i[@class='fa fa-level-up']")
    public WebElement listelenenKursSeviye;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div[2]/ul/li[4]/div/div[2]/a")
    public WebElement scrollKonumu;








    // kursa tiklayin get enroll tiklayin secimin basarili oldugunu test edin












}
