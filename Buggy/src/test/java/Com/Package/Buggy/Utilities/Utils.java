package Com.Package.Buggy.Utilities;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Utils
    {
    public static WebDriver driver;
    public Utils() throws IOException
    {
    }
    public static void kill()
    {
        System.out.println("Closing Browser");
        driver.manage().deleteAllCookies();
        driver.close();
        driver = null;
    }
    public static WebDriver initializeBrowser()
    {
      String Browser = "Chrome";
      String URl = "http://buggy.justtestit.org/";

      if (Browser.equalsIgnoreCase("Chrome"))
      {
            System.out.println("Opening Chrome Browser Session");
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(URl);
            System.out.println("Chrome -->" + driver.getTitle());
        }
      else if (Browser.equalsIgnoreCase("Firefox"))
      {
            System.out.println("Opening FF Browser Session");
            System.setProperty("webdriver.gecko.driver", "");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(URl);
        }
        else if (Browser.equalsIgnoreCase("IE"))
        {
            System.out.println("Opening InternetExplorer Browser Session");
            System.setProperty("webdriver.ie.driver", "");
            driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            driver.get(URl);
        }
        else if (Browser.equalsIgnoreCase("Edge"))
        {
            System.out.println("Opening Edge Browser Session");
            System.setProperty("webdriver.edge.driver", "");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get(URl);
        }
        return driver;
    }
    public static void VerifyPageTitle(String actualTitle)
    {
        try
        {
            String expectedTitle = driver.getTitle();
            Assert.assertEquals(actualTitle,expectedTitle);
        }
        catch (AssertionError e)
        {
            throw new AssertionError(e.getMessage());
        }
    }
    /*
     * This method will be used to Switch to a pop up/Alert using web element
     */
    public static Alert switchtoalert(WebElement element)
    {
        Alert alert = switchtoalert(element);
        return alert;
    }
    /*
     * This is implicit wait tells web driver to wait for certain amount of time
     * before it throws a "No Such Element Exception".We can change time units
     * to SECONDS, MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS,
     * etc.
     */
    public static void impicitwait(int TimeOut)
    {
        driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
    }
    /*
     * This is implicit wait tells web driver to wait for certain amount of time
     * before it throws any known exception.We can change time units to SECONDS,
     * MINUTES, MILISECOND, MICROSECONDS, NANOSECONDS, DAYS, HOURS, etc.
     */
    public static void Fluentwait(int TimeOut, Class exceptiontype)
    {
        Wait Fluentwait = new FluentWait(TimeOut).pollingEvery(5, TimeUnit.SECONDS).ignoring(exceptiontype);

    }
    /*
     * This method will be used to tell the web driver to wait till the
     * visibility of mentioned web element
     */
    public static void waitforvisibilityofelement(WebDriver driver, int timeinseconds, WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    /*
     * This method will be used to tell the web driver to wait till the
     * visibility of mentioned alert
     */
    public static void waitforalert(WebDriver driver, int timeinseconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.alertIsPresent());
    }
    /*
     * This method will be used to tell the web driver to wait till the state of
     * mentioned element selected
     */
    public static void waitforelementselectionstate(WebDriver driver, int timeinseconds, WebElement element,
                                                    boolean selected)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.elementSelectionStateToBe(element, selected));
    }
    /*
     * This method will be used to tell the web driver to wait till the
     * mentioned element to be clickable
     */
    public static void waitforelementtobclickable(WebDriver driver, int timeinseconds, WebElement element,
                                                  boolean selected) {

        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    /*
     * This method will be used to tell the web driver to wait till the
     * mentioned frame to be visible
     */
    public static void waitforframaetobeavailable(WebDriver driver, int timeinseconds, WebElement element,
                                                  boolean selected) {

        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
    }
    /*
     * This method will be used to tell the web driver to wait till the
     * mentioned locator is invisible
     */
    public static void waitinvisibilityofelement(WebDriver driver, int timeinseconds, WebElement element, By locator) {

        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    /*
     * This method will be used to tell the web driver to wait till the
     * mentioned locator with text is invisible
     */
    public static void waitforinvisibilityofelementwithtext(WebDriver driver, int timeinseconds, String text,
                                                            By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, text));
    }
    /*
     * This method will be used to tell the web driver to wait till the presence
     * of all the elements located by the mentioned locator
     *
     */
    public static void waitforpresenceofallelementslocated(WebDriver driver, int timeinseconds, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
    /*
     * This method will be used to tell the web driver to wait till the presence
     * of element located by the mentioned locator
     */
    public static void waitforpresenceofelementlocated(WebDriver driver, int timeinseconds, By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
    /*
     * This method will be used to tell the web driver to wait till the text to
     * be present in the mentioned element
     *
     */
    public static void waitfortexttobepresent(WebDriver driver, int timeinseconds, WebElement element, String text)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }
    /*
     * This method will be used to tell the web driver to wait till the
     * mentioned title visible
     */
    public static void waitfortitle(WebDriver driver, int timeinseconds, String title)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.titleIs(title));
    }
    /*
     * This method will be used to tell the web driver to wait till the
     * mentioned title matches
     */
    public static void waitfortitlecontains(WebDriver driver, int timeinseconds, String title)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeinseconds);
        wait.until(ExpectedConditions.titleContains(title));
    }

    /*
     * This method will returns the currently opened application's URL
     */
    public static String geturl()
    {
        String url = driver.getCurrentUrl();
        return url;
    }
}
