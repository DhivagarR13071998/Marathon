package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        
        driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        System.out.println(url);
        if(url.contains("chennai")) {
        	System.out.println("chennai is present");
        }
        else {
        	System.out.println("chennai is not there");
        }
        driver.findElement(By.id("4")).click();
        driver.findElement(By.tagName("input")).sendKeys("Shazam!Fury of the Gods");
        driver.findElement(By.xpath("//div[@class='sc-fFTYTi kXEckc']")).click();
        driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
        driver.findElement(By.xpath("//span[text()='IMAX 2D']")).click();
        String sPIPalazzoNexus = driver.findElement(By.className("__venue-name")).getText();
        System.out.println(sPIPalazzoNexus);
        driver.findElement(By.className("info-section")).click();
        String parkingFacility = driver.findElement(By.xpath("//div[text()='            Parking Facility        ']")).getText();
        System.out.println(parkingFacility);
        if (parkingFacility.contains(parkingFacility)) {
        	System.out.println("Parking is present");
        }
        driver.findElement(By.xpath("//div[@class='cross-container']")).click();
        driver.findElement(By.xpath("(//div[@class='__text'])[3]")).click();
        driver.findElement(By.id("btnPopupAccept")).click();
        driver.findElement(By.id("pop_1")).click();
        driver.findElement(By.id("proceed-Qty")).click();
        driver.findElement(By.xpath("//div[@id='A_7_015']/a[1]")).click();
        String payRs = driver.findElement(By.xpath("//a[@id='btmcntbook']")).getText();
        System.out.println(payRs);
    	}
	}

