package tests.day13;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01 {


    @Test
    public void test01(){
        Driver.getDriver().get("https://www.qualitydemy.com");
    }

    @Test
    public  void kontrolTest(){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

    }


}
