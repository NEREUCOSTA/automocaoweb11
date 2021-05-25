package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {

   
    private String url;
    private  WebDriver  driver;
    JavascriptExecutor js;


    @Before
    public void setUp() {
        url = "http://automationpractice.com/index.php";
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\DRIVERS\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

        js = (JavascriptExecutor) driver;

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void InformacoesUsuarioTest() throws InterruptedException{

    driver.get(url);
            driver.findElement(By.linkText("Sign in")).click();
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            Thread.sleep(10000);

            login();
            women();
            printedChiffonDress();
            fadedShortSleeveTShirts();
            blouse();
            printedDress();
            printedSummerDress();

            }

    public void login() throws InterruptedException {
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("datumqatest@soprock.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("datum2021");
        driver.findElement(By.id("SubmitLogin")).click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
        }
    public void women() throws InterruptedException {
        driver.findElement(By.linkText("Women")).click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);

        }

    public void addProduct() throws InterruptedException{
        driver.findElement(By.id("add_to_cart")).click();
        proceedToCheckout();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
        }

    public void proceedToCheckout() throws InterruptedException{
        driver.findElement(By.linkText("Proceed to checkout")).click();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
        women();
        }

    public void printedChiffonDress() throws InterruptedException {
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();
        addProduct();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
        }

    public void fadedShortSleeveTShirts() throws InterruptedException {
        driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        addProduct();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
        }
    public void blouse() throws InterruptedException {
        driver.findElement(By.linkText("Blouse")).click();
        addProduct();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
        }

    public void printedDress() throws InterruptedException {
        driver.findElement(By.linkText("Printed Dress")).click();
        addProduct();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
        }

    public void printedSummerDress() throws InterruptedException {
        driver.findElement(By.linkText("Printed Summer Dress")).click();
        addProduct();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(1000);
        }
}

