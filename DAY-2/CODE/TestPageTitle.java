package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class TestPageTitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\webdriver\\msedgedriver.exe");

		// EdgeOptions configuration
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*"); // Bypass security restrictions
        options.setCapability("ms:edgeOptions", options);
        options.setCapability("se:ieOptions", "{}"); // Fix WebSocket issue

     // Start EdgeDriver
        WebDriver driver = new EdgeDriver(options);
        
        driver.get("https://www.google.com");
        String title= driver.getTitle();
        System.out.println("Title of web app home page is : "+title); 
        driver.quit();
		

	}

}
