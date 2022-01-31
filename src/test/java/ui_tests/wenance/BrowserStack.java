package ui_tests.wenance;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.Driver;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserStack extends Driver{
    Logger log = LogManager.getLogger(BrowserStack.class);



  public WebDriver driver;
 public static final String USERNAME = "juancruzmatar_2XF1oV";
 public static final String AUTOMATE_KEY = "7JZ9nwmpZDXoyZMsvqK8";
 public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";


 

 
 @Test
 public void openSTM() throws Exception {
                // To execute scripts through remote server or grid on mulitple browsers, we need to set capabilities of platform, version etc., to run the scripts
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setPlatform(Platform.WIN10);
				caps.setCapability("browserName", "iPhone");
				caps.setCapability("device", "iPhone 11");
				caps.setCapability("realMobile", "true");
				caps.setCapability("os_version", "14.0");
				caps.setCapability("name", "BStack-[Java] Across Wenance"); // test name
 // Creatng URL object
 URL browserStackUrl = new URL(URL);
 // Create object of driver. We execute scripts remotely. So we use RemoteWebDriver
 //There are many constructors to remotewebdriver
                //To pass URL object and Capabilities object, use the below mentioned constructor
                //RemoteWebDriver(URL remoteAddress, Capabilities desiredCapabilities)
 driver = new RemoteWebDriver (browserStackUrl, caps);
 //Implicit wait for 30 seconds
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 driver.get("https://www.carocuore.com/");
 isThereJSErrorOnThePage();

 List<WebElement> links = driver.findElements(By.tagName("a"));
 ArrayList<String> valid_links = new ArrayList<>();
 String flag = ""; // A flag is added so that the link is not repeated

 log.info("Total links found → " + links.size());

 for (WebElement link : links) {
     log.info(link.getAttribute("href"));
     if (link.getAttribute("href") != null && link.getAttribute("href").contains("http") && !link.getAttribute("href").equals(flag)) {
         valid_links.add(link.getAttribute("href"));
         flag = link.getAttribute("href");
     }
 }

 log.info("Total of valid links found → " + valid_links.size());

 int i = 0;
 for (String href : valid_links) {
     log.info((++i) + ":: Navigate to URL with href: " + href);
     driver.navigate().to(href);
 }
}

public boolean isThereJSErrorOnThePage() {
 Set<String> errorStrings = new HashSet<>();
 errorStrings.add("SyntaxError");
 errorStrings.add("EvalError");
 errorStrings.add("ReferenceError");
 errorStrings.add("RangeError");
 errorStrings.add("TypeError");
 errorStrings.add("URIError");
 LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
 for (LogEntry logEntry : logEntries) {
     for (String errorString : errorStrings) {
         if (logEntry.getMessage().contains(errorString)) {
             log.error("Java Script error has been detected:");
             log.error(logEntry.getLevel() + " " + logEntry.getMessage());
             return true;
         }
     }
 }
 return false;
}
 
  
    
}
