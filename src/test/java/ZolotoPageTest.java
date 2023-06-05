import org.testng.annotations.Test;
public class ZolotoPageTest extends BaseTest{
    @Test(priority = 1)
    public void titleZolotoPageTest(){
        mainPage.openPage();
        mainPage.switchToSectionZoloto();
        System.out.println(driver.getTitle());
        zolotoPage.checkNameOfPage();
    }
    @Test(priority = 2)
    public void filterByCheaptoExpensiveTest(){
        mainPage.openPage();
        mainPage.switchToSectionZoloto();
        zolotoPage.choiceFilterCheapToExpensiveAndCheck();
    }
    @Test(priority = 3)
    public void filterByExpensiveToCheapTest(){
        mainPage.openPage();
        mainPage.switchToSectionZoloto();
        zolotoPage.choiceFilterExpensiveToCheapAndCheck();

    }
    @Test(priority = 4)
    public void addToBasket(){
        mainPage.openPage();
        mainPage.switchToSectionZoloto();
        zolotoPage.addToBasketProductAndCheck();
    }

    @Test(priority = 5)
    public void noProductIncompatibleFilters(){
        mainPage.openPage();
        mainPage.switchToSectionZoloto();
        zolotoPage.choiseIncorrectFilter();
        zolotoPage.checkIncorrectFilters();
    }

}
