package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class TestLoginPageXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\webdriver\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*"); // Bypass security restrictions
        options.setCapability("ms:edgeOptions", options);
        options.setCapability("se:ieOptions", "{}"); // Fix WebSocket issue
        WebDriver driver = new EdgeDriver(options);
        driver.get("https://practicetestautomation.com/practice-test-login/"); 
        driver.manage().window().maximize();
        
       
        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        usernameField.sendKeys("student");
          
        
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password123");
        
        WebElement btnSubmit= driver.findElement(By.xpath("//button[@id='submit']"));
        btnSubmit.click();
        
        Thread.sleep(4000);
        
        if(driver.getCurrentUrl().contains("logged-in-successfully"))
        {
        	System.out.println("Test Passed: Login Successful");
        }
        else
        {
        	System.out.println("Test Fialed: Login Failed");
        }   
        
        Thread.sleep(5000);
        driver.quit();

	}

}
