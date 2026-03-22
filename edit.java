package test2;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class edit {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/.");
        String expectedofpage = "leaftaps";
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
        driver.findElement(By.xpath("//input[@value=\'Login\']")).click();

        driver.findElement(By.partialLinkText("CRM/SFA")).click();

        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

        driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("sanikaaa");

        driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("sana");

        driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("mani");

        driver.findElement(By.xpath("//input[@id=\'createLeadForm_firstNameLocal\']")).sendKeys("ms");

        driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("learning");

        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("all is well");

        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sahana@09.gmail.com");

        WebElement stateDD = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select state = new Select(stateDD);
        state.selectByVisibleText("New York");

        driver.findElement(By.xpath("//input[@name='submitButton']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[text()='Edit']")).click();

        driver.findElement(By.name("description")).clear();

        driver.findElement(By.name("importantNote")).sendKeys("its mandatory");

        driver.findElement(By.xpath("//input[@value='Update']")).click();

        System.out.println("tiitle of page is :" + driver.getTitle());

        driver.close();

    }
}
