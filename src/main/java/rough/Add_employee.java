package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Add_employee {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();



		//User hover On PIM
		WebElement Admin;
		Admin = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewPimModule")));
		Actions act = new Actions(driver);
		act.moveToElement(Admin).build().perform();



		// Click on Add Employee
		WebElement AddEmployee = new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_addEmployee")));
		AddEmployee.click();



		String ActualEmployeeHeading = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[1]/div[1]")).getText();
		String ExpectedEmployeeHeading = "Add Employee" ;
		System.out.println(ActualEmployeeHeading);

		//Assert.assertEquals(ActualEmployeeHeading, ExpectedEmployeeHeading ,"User Not in Add Employee section");

		driver.findElement(By.id("firstName")).sendKeys("Jhon");
		driver.findElement(By.id("lastName")).sendKeys("Ali");
		WebElement EmpID= driver.findElement(By.id("employeeId"));
		EmpID.clear();
		EmpID.sendKeys("1");
		//EmpID.sendKeys(Random);
		driver.findElement(By.id("btnSave")).click();










	}

}
