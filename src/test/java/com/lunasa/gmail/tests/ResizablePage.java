//package pages;
//
//import bonus.ActionsDemoPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class ResizablePage extends ActionsDemoPage {
//    private static final By SIZE_HANDLE_LOCATOR = By.cssSelector(".ui-resizable-se");
//
//    public ResizablePage resizeSquare() {
//        switchToFrame();
//        waitForElementVisible(SIZE_HANDLE_LOCATOR);
//        WebElement handle = driver.findElement(SIZE_HANDLE_LOCATOR);
////        Screenshoter.takeScreenshot();
//        new Actions(driver).clickAndHold(handle).moveByOffset(150, 100).release(handle).build().perform();
// //       Screenshoter.takeScreenshot();
//        System.out.println("Successfully resized a square!");
//        return this;
//    }
//}
