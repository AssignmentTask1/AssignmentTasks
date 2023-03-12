package RestAssuredTask.Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateContactUsPage {

    WebDriver driver;
    WebDriverWait wait;

    public void openBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headed");
        options.addArguments("--allowed-ips");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
    public WebDriver getDriverInstance(){
        return driver;
    }
    public void quitBrowser(){
        driver.quit();
    }
    public void launchWebsite(String url){
        openBrowser();
        driver.get(url);
    }
    public String getPageTitle(){
        return driver.getTitle();
    }
    public void navigateToContactUsLink(){
        WebElement contactUsElement = driver.findElement(By.id("contact-link"));
        contactUsElement.click();
    }
    public void enterEmail(String email){
        WebElement emailElement = driver.findElement(By.id("email"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emailElement);
        emailElement.sendKeys(email);
    }
    public void enterOrder(String order){
        WebElement orderElement = driver.findElement(By.id("id_order"));
        orderElement.sendKeys(order);
    }
    public void enterMessage(String message){
        WebElement messageElement = driver.findElement(By.id("message"));
        messageElement.sendKeys(message);
    }
    public void clickSendBtn(){
        WebElement sendBtn = driver.findElement(By.id("submitMessage"));
        sendBtn.click();
    }
    public String getErrorMessage(){
        return driver.findElement(By.cssSelector("ol > li")).getText();
    }
}
