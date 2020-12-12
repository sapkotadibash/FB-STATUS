import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBFRIEND {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver Samjhana= new ChromeDriver(options);
		
		String URL = "https://www.facebook.com/";
		
		Samjhana.manage().window().maximize();
		Samjhana.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Samjhana.get(URL);
		Samjhana.findElement(By.id("email")).sendKeys("sapkotadibash@gmail.com");
		Samjhana.findElement(By.name("pass")).sendKeys("Kathmandu@12345");
		Samjhana.findElement(By.name("login")).click();
		
//		Samjhana.findElement(By.xpath("//div[@class= 'm9osqain a5q79mjw jm1wdb64 k4urcfbm']")).clear();
	Samjhana.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/div/div[1]/span")).click();
	Samjhana.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div/div/div/div[2]/div/div/div/div")).sendKeys("Learning Selenium");
	Samjhana.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div[3]/div[2]/div")).click();
	
//	Samjhana.close();
	}

}
