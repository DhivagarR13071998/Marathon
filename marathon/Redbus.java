package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.findElement(By.id("src")).sendKeys("Chennai");
driver.findElement(By.className("selected")).click();
driver.findElement(By.id("dest")).sendKeys("Bangalore");
driver.findElement(By.className("selected")).click();
driver.findElement(By.xpath("//td[text()='24']")).click();
driver.findElement(By.id("search_btn")).click();
String chennaiBan = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
System.out.println(chennaiBan);
driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
String kMRLKalaimakal = driver.findElement(By.xpath("(//div[contains(@class,'travels lh-24')])[2]")).getText();
System.out.println(kMRLKalaimakal);
String title=driver.getTitle();
System.out.println(title);

	}

}
