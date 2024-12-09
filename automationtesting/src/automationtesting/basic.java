package automationtesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class basic 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://student.qspiders.com/login");
		driver.quit();
		
	}

}
