import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class MainPageTests extends BaseTest{

    @Test(priority = 1)
    public void titleTest() {
        mainPage.openPage();
        System.out.println(driver.getTitle());
        mainPage.checkNameOfPage();
    }
    @Test(priority = 2)
    public void comeBacktoMainViaLogo(){
        mainPage.openPage();
        mainPage.switchToSectionZoloto();
        mainPage.comeBackToMainPageViaLogo();
    }
    @Test(priority = 3)
    public void rederectToFacebook(){
        mainPage.openPage();
        Set<String> setFirst = driver.getWindowHandles();
        String firstdDesc = setFirst.iterator().next();
        mainPage.clickOnSocialNet();
        Set<String> setSecond = driver.getWindowHandles();
        setSecond.removeAll(setFirst);//убираем дубликаты
        String secondDesc = setSecond.iterator().next();
        driver.switchTo().window(secondDesc);
        System.out.println(driver.getCurrentUrl());
        mainPage.checkPageOfFB();
        driver.switchTo().window(firstdDesc);
    }
    @Test(priority = 4)
    public void korzinaDisplayed(){
        mainPage.openPage();
        mainPage.checkDisplayedKorzina();
    }
    @Test(priority = 5)
    public void zakazZvorotniiDzvinok(){
        mainPage.openPage();
        mainPage.zakazZvorotnDzvinka("Виталий");

    }
    @Test(priority = 6)
    public void countSection(){
        mainPage.openPage();
        mainPage.sections();
        List<WebElement> listSection=driver.findElements(By.xpath("//ul[@class='list-unstyled catalog-drop-list']/li"));
        assertTrue(listSection.size()==7);
    }


}