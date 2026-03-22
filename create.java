package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class create {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/.");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@value=\'Login\']")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.xpath("//a[text()=\"Accounts\"]")).click();
        driver.findElement(By.xpath("//a[text()='Create Account']")).click();
        driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("sahananr");
        driver.findElement(By.xpath("//textarea[@name=\"description\"]")).sendKeys("Selenium Automation Tester");

        Thread.sleep(3000);

        WebElement industry = driver.findElement(By.name("industryEnumId"));
        Select industry1Select = new Select(industry);
        industry1Select.selectByVisibleText("Computer Software");

        WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
        Select ownerSelect = new Select(ownership);
        ownerSelect.selectByVisibleText("S-Corporation");

        WebElement sourceid = driver.findElement(By.name("dataSourceId"));
        Select souSelect = new Select(sourceid);
        souSelect.selectByValue("LEAD_EMPLOYEE");

        WebElement marketingCampaignId = driver.findElement(By.name("marketingCampaignId"));
        Select maSelect = new Select(marketingCampaignId);
        maSelect.selectByIndex(6);

        WebElement generalStateProvinceGeoId = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select gSelect = new Select(generalStateProvinceGeoId);
        gSelect.selectByValue("TX");

        driver.findElement(By.xpath("//input[@value=\"Create Account\"]")).click();

        String accnameString = driver.findElement(By.xpath("//input[@id='accountName']")).getText();

        CharSequence accountName = accnameString;
        if (accnameString.contains(accountName)) {

            System.out.println("accountName displayed");

        } else{
            System.out.println("accountname is not displayed");
        }
        
        driver.close();

    }
}


