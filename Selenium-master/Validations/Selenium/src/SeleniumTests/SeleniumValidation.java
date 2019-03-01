package SeleniumTests;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class SeleniumValidation {
	
	static WebDriver driver;
	public static String browser = "chrome";

	public static void main(String[] args) {
		
		
		browserConfig();
		runTest();
		
		
	}
	
	public static void browserConfig()
	{
				
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation+"/lib/chromedriver_win32/chromedriver.exe");

		//how are you
		driver = new ChromeDriver();
		
	}
	
	public static void runTest()
	{
		driver.get("https://flightcentre.com.au/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("expoint")).sendKeys("BNE");
		List<WebElement> fromLocation = driver.findElements(By.xpath("//*[@id=\"mini-panel-fcc_homepage_banner\"]/div[2]/div/div/div/div/div/div/div[3]/div[1]/form/div[2]/div[1]/div[2]/div/span[2]/div/div[2]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fromLocation.get(0).click();
		
		driver.findElement(By.name("destination")).sendKeys("DELH");
		List<WebElement> toLocation = driver.findElements(By.xpath("//*[@id=\"mini-panel-fcc_homepage_banner\"]/div[2]/div/div/div/div/div/div/div[3]/div[1]/form/div[2]/div[1]/div[3]/div/span[2]/div/div[2]"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		toLocation.get(0).click();
		
		driver.findElement(By.name("departDate")).click();
		
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div/div[1]/div/div[2]/div/div[1]/button[2]")).click();
		
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div/div/div[1]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[6]/div/div[1]/div/div/div[1]/div/div[2]/div/div[3]/div/div/div[2]/button[3]")).click();
		
		
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"mini-panel-fcc_homepage_banner\"]/div[2]/div/div/div/div/div/div/div[3]/div[1]/form/div[2]/div[4]/button/div/div")).submit();
		
		try {

			   

		    for(String winHandle : driver.getWindowHandles()){
		        driver.switchTo().window(winHandle);
		        String act = driver.getCurrentUrl();
		       
		    }
		    }catch(Exception e){
		   System.out.println("fail");
		    }
		
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);

	    //wait.until(ExpectedConditions.elementToBeClickable(FindElement(By.xpath("//*[@id=\"flightResults\"]/div/div[2]/div[3]/div[1]/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/button"))));
		
		driver.findElement(By.xpath("//*[@id=\"flightResults\"]/div/div[2]/div[3]/div[1]/div/div[1]/div[1]/div[2]/div/div[2]/div[2]/div/button")).click();

		
		
	}

	private static By FindElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}


}