package pages;

import org.openqa.selenium.By;

/**
 * Created by odiachuk on 07.07.17.
 */
public class ShopPage extends BasePage{

    private static ShopPage instance;
    public static ShopPage Instance = (instance != null) ? instance : new ShopPage();

    public ShopPage(){
        pageURL = "/shop";
    }

    /** UI Mappings */

    By shopOurMattressButton = By.xpath(".//a[text()='SHOP Our Hybrid Mattress']");
    By shopOurFoamPillowButton = By.xpath(".//a[text()='SHOP OUR PILLOW'])[1]");
    By shopOurPlushPillowButton = By.xpath(".//a[text()='SHOP OUR PILLOW'])[2]");

    By shopOurTrackerButton = By.xpath(".//a[text()='SHOP OUR TRACKER']");
    By shopOurSheetsButton = By.xpath(".//a[text()='SHOP OUR SHEETS']");
    By shopOurComforterButton = By.xpath(".//a[text()='SHOP OUR COMFORTER']");
    By shopOurCoverButton = By.xpath(".//a[text()='SHOP OUR COVER']");
    By shopSheetsButton = By.xpath(".//a[text()='SHOP OUR SHEETS']");

    By shopOurDrapesButton = By.xpath(".//a[text()='SHOP OUR CURTAINS']");

    public String shopPageUrl = "https://www.tomorrowsleep.com/drapes";

    /** Page Methods **/

    public MattressesPage clickOnShopOurMattressButton() {
        waitForPageToLoad();
        reporter.info("Click on Shop Our Mattress");
        scrollToShopElement(driver().findElement(shopOurMattressButton));
        findElement(shopOurMattressButton).click();
        return MattressesPage.Instance;
    }

    public FoamPillowPage clickOnShopOurFoamPillowButton() {
        reporter.info("Click on Shop Our Pillow (Foam)");
        scrollToShopElement(driver().findElement(shopOurFoamPillowButton));
        findElement(shopOurFoamPillowButton).click();
        return FoamPillowPage.Instance;
    }

    public PlushPillowPage clickOnShopOurPlushPillowButton() {
        reporter.info("Click on Shop Our Pillow (Plush)");
        scrollToShopElement(driver().findElement(shopOurPlushPillowButton));
        findElement(shopOurPlushPillowButton).click();
        return PlushPillowPage.Instance;
    }

    public MonitorPage clickOnShopOurMonitorButton() {
        reporter.info("Click on Shop Our Monitor");
        scrollToShopElement(driver().findElement(shopOurTrackerButton));
        findElement(shopOurTrackerButton).click();
        return MonitorPage.Instance;
    }

    public SheetsetPage clickOnShopOurSheetsButton() {
        reporter.info("Click on Shop Our Sheets");
        scrollToShopElement(driver().findElement(shopOurSheetsButton));
        findElement(shopOurSheetsButton).click();
        return SheetsetPage.Instance;
    }
    public FoundationPage clickOnShopFoundationButton(){
        reporter.info("Click on Shop Foundation");
        clickOnElement(By.partialLinkText("Platform Bed"));
        return FoundationPage.Instance;
    }
    public AdjustablePage clickOnShopOurBaseButton() {
        reporter.info("Click on Shop Our Adjustable Base");
        clickOnElement(By.partialLinkText("Adjustable Bed"));
        return AdjustablePage.Instance;
    }

    public ComforterPage clickOnShopOurComforterButton() {
        reporter.info("Click on Shop Our Comforter");
        scrollToShopElement(driver().findElement(shopOurComforterButton));
        findElement(shopOurComforterButton).click();
        return ComforterPage.Instance;
    }

    public MattressProtectorPage clickOnShopOurCoverButton() {
        reporter.info("Click on Shop Our Cover");
        scrollToShopElement(driver().findElement(shopOurCoverButton));
        findElement(shopOurCoverButton).click();
        return MattressProtectorPage.Instance;
    }

    public DrapesPage clickOnShopOurDrapesButton() {
        reporter.info("Click on Shop Our Drapes");
        scrollToShopElement(driver().findElement(shopOurDrapesButton));
        findElement(shopOurDrapesButton).click();
        return DrapesPage.Instance;
    }

    public SheetsetPage clickOnShopSheetsButton() {
        scrollToShopElement(driver().findElement(shopSheetsButton));
        reporter.info("Click on Shop Our Sheets");
        findElement(shopSheetsButton).click();
        return SheetsetPage.Instance;
    }

}
