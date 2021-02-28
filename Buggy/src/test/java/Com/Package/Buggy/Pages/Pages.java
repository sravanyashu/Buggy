package Com.Package.Buggy.Pages;
import Com.Package.Buggy.Utilities.Utils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class Pages {
    @FindBy(id = "firstName")
    public static WebElement firstName;
    @FindBy(id = "lastName")
    public static WebElement lastName;
    @FindBy(id = "password")
    public static WebElement password;
    @FindBy(id = "confirmPassword")
    public static WebElement confirmPassword;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    public static WebElement register;
    @FindBy(xpath = "//a[@class='btn btn-success-outline']")
    public static WebElement register1;
    @FindBy(id = "username")
    public static WebElement username;
    @FindBy(xpath = "//div[@class='result alert alert-success']")
    public static WebElement registrationSuccess;
    @FindBy(name = "login")
    public static WebElement login;
    @FindBy(name = "password")
    public static WebElement loginPassword;
    @FindBy(xpath = "//button[@class='btn btn-success']")
    public static WebElement loginButton;
    @FindBy(xpath = "//h2[contains(text(), 'Popular Make')]")
    public static WebElement popularMake;
    @FindBy(xpath = "(//div[@class='card-block'])[1]")
    public static WebElement popularMakeText;
    @FindBy(xpath = "//img[@title='Lamborghini']")
    public static WebElement lamborghiniButton;
    @FindBy(xpath = "//h2[contains(text(), 'Popular Model')]")
    public static WebElement popularModel;
    @FindBy(xpath = "//img[@title='Diablo']")
    public static WebElement diabloButton;
    @FindBy(xpath = "//div[@class='card-block']/ul")
    public static WebElement specifications_Diablo;
    @FindBy(xpath = "(//div[@class='card']//h4)[2]")
    public static WebElement votes_Diablo;
    @FindBy(xpath = "(//div[@class='card-block']//h3)[1]")
    public static WebElement verifyPopularMake_Lamborghini;
    @FindBy(xpath = "(//div[@class='card-block']//h3)[2]")
    public static WebElement verifyPopularMake_LamborghiniDiablo;
    @FindBy(xpath = "(//div[@class='card-block']//h3)[3]")
    public static WebElement verifyOverAllRatings;
    @FindBy(xpath = "(//img[@class='img-fluid center-block'])[3]")
    public static WebElement overAllRatingsBtn;
    @FindBy(xpath = "//img[@title='Pagani Zonda']")
    public static WebElement paganiZonda;
    @FindBy(xpath = "//table[@class='cars table table-hover']//tr")
    public static List<WebElement> table;


    public static void Register(String Username, String Firstname, String Lastname, String Password) throws InterruptedException {
        Thread.sleep(4000);
        register1.click();
        username.sendKeys(Username);
        firstName.sendKeys(Firstname);
        lastName.sendKeys(Lastname);
        password.sendKeys(Password);
        confirmPassword.sendKeys(Password);
    }

    public void VerifyRegistrationSuccessfull(String expectedMsg) {
        try {
            String actualMSG = registrationSuccess.getText();
            assertEquals(actualMSG, expectedMsg);
        } catch (AssertionError e) {
            throw new AssertionError(e.getMessage());
        }
    }

    public void Login(String Username, String Password) {
        login.sendKeys(Username);
        Utils.impicitwait(10);
        loginPassword.sendKeys(Password);
        Utils.impicitwait(10);
        loginButton.click();
        Utils.impicitwait(30);
    }

    public void VerifyImageOnHomePage(String expectedPopularMake, WebElement element) {
        try {
            String actualPopularMake = element.getText();
            actualPopularMake = actualPopularMake.substring(0,actualPopularMake.indexOf("(")).trim();
            assertEquals(actualPopularMake, expectedPopularMake);
        } catch (AssertionError e) {
            throw new AssertionError(e.getMessage());
        }
    }
    public void VerifyOverAllRating(String ExpectedRating, WebElement element)
    {
        try {
            String actualOverAllRating = element.getText();
            assertEquals(actualOverAllRating, ExpectedRating);
        } catch (AssertionError e) {
            throw new AssertionError(e.getMessage());
        }
    }
    public void VerifySpecsAndVotes(String actualSpecs, String actualVotes) {
        try {
            String expectedSpecsDiablo = specifications_Diablo.getText().replaceAll("\\r\\n|\\r|\\n", " ");
            String expectedVotesDiablo = votes_Diablo.getText().trim();
            Assert.assertEquals(actualSpecs, expectedSpecsDiablo);
            Assert.assertEquals(actualVotes, expectedVotesDiablo);
        } catch (AssertionError e) {
            throw new AssertionError(e.getMessage());
        }
    }
    public void PrintTable() {

        List<WebElement> allRows = table;
        for (WebElement row : allRows)
        {
            List<WebElement> cells = row.findElements(By.tagName("td"));
               for (WebElement cell : cells)
               {
                System.out.println(cell.getText());
               }
        }
    }
}
