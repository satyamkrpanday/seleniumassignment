package register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.edge.driver", "D:\\training\\selenium\\selenium-test\\src\\drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

       
        driver.get("https://demo.guru99.com/test/newtours/register.php");

      
        WebElement firstname = driver.findElement(By.name("firstName"));
        firstname.sendKeys("Satyam");



        WebElement lastname = driver.findElement(By.name("lastName"));
        lastname.sendKeys("Pandey");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("9169950434");

        WebElement email = driver.findElement(By.id("userName"));
        email.sendKeys("satyamkrpandey@gmail.com");

        WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
        address.sendKeys("Maldahiya");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Varanasi");

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Uttar Pradesh");

        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("221002");

       
        // WebElement country = driver.findElement(By.name("country"));
        // country.sendKeys("INDIA");
        Select droplist = new Select(driver.findElement(By.name("country")));
        droplist.selectByVisibleText("INDIA");
      
        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("satyamkrpandey");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12321");

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("12321");

       
        // WebElement submitButton = driver.findElement(By.name("submit"));
        // submitButton.click();
        WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();

        
        
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
