package sdpack;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdef {
	public static WebDriver driver;
	@Given("^user launchapplication$")
	public void user_launchapplication() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://staging.x0pa.ai/app/roboroy");  
        driver.findElement(By.id("hs-eu-confirmation-button")).click();
        driver.findElement(By.linkText("Candidate Login")).click();   
	}

	@When("^user enter valid credentials$")
	public void user_enter_valid_credentials() throws Throwable {
		driver.findElement(By.name("username")).sendKeys("paul@trainingqa.com");
		driver.findElement(By.name("password")).sendKeys("XPAStag0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='mb-2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(4000);
		}

	@When("^Close Browser$")
	public void close_Browser() throws Throwable {
		Thread.sleep(2000);
		driver.close();
	}    

	@When("^user click on logout$")
	public void user_click_on_logout() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/section/div[1]/div/header/div[1]/button[4]/svg")).click();   
	}

	@When("^User clicks on Jobs Menu$")
	public void user_clicks_on_Jobs_Menu() throws Throwable {
		driver.findElement(By.xpath("/html/body/section/div[1]/div/header/nav/ul/li[2]/a/span/b")).click();
				    
	}

	@When("^select create new job section$")
	public void select_create_new_job_section() throws Throwable {
		 driver.findElement(By.linkText("Create New Job")).click();
		 Thread.sleep(2000);
	}
	    

	@When("^click on Start button of form$")
	public void click_on_Start_button_of_form() throws Throwable ,FileNotFoundException{
		driver.findElement(By.xpath("//div[@class='mt-3']//child::button[contains(text(),'Start')]")).click(); 
		Thread.sleep(3000);
	}
   @When("^click on Add New Office button to add new office Address$")
	public void click_on_Add_New_Office_button_to_add_new_office_Address() throws Throwable {
	    WebElement OfficeAddress=driver.findElement(By.xpath("//input[@id='react-select-3-input']"));
	    OfficeAddress.sendKeys("Hyderabad");
		Thread.sleep(3000);
		OfficeAddress.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		OfficeAddress.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	   driver.findElement(By.xpath("//button[contains(text(),'Add New office')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addressLine1")).sendKeys("peaceful city");
		Thread.sleep(2000);
		WebElement city=driver.findElement(By.id("react-select-12-input"));
		city.sendKeys("Hyderabad");
		Thread.sleep(3000);
		city.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		city.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='app-container']/div[1]/div/div[3]/div/section/div/div/div[4]/div/div[3]/button[2]")).click();
	
	}

	@When("^add Job Title$")
	public void add_Job_Title() throws Throwable {
		WebElement jobtitle=driver.findElement(By.xpath("//input[@placeholder='Job Title']"));
		jobtitle.sendKeys("Java Developers");
		Thread.sleep(2000);    
	}

	@When("^select Job Status$")
	public void select_Job_Status() throws Throwable {
		WebElement jobstatus=driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		jobstatus.sendKeys("Both");
		jobstatus.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		jobstatus.sendKeys(Keys.ENTER);
		Thread.sleep(2000);  
	}

	@When("^Select Country Location$")
	public void select_Country_Location() throws Throwable {
		WebElement countrylocation=driver.findElement(By.xpath("//input[@id='react-select-5-input']"));
		countrylocation.sendKeys("india");
		countrylocation.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		countrylocation.sendKeys(Keys.ENTER);
		Thread.sleep(2000);   
	}

	@When("^Select City location$")
	public void select_City_location() throws Throwable {
		WebElement citylocation=driver.findElement(By.id("react-select-6-input"));
		citylocation.sendKeys("Hyderabad");
		citylocation.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(5000);
		citylocation.sendKeys(Keys.ENTER);
		Thread.sleep(3000);   
	}

	@When("^add skills$")
	public void add_skills() throws Throwable {
		WebElement skills=driver.findElement(By.id("react-select-7-input"));
		skills.sendKeys("java");
		skills.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		skills.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		skills.sendKeys("sql");
		skills.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		skills.sendKeys(Keys.ENTER);
		Thread.sleep(4000);    
	}

	@When("^add Qualification$")
	public void add_Qualification() throws Throwable {
		 WebElement qualification=driver.findElement(By.xpath("//input[@id='react-select-8-input']"));
	        qualification.click();
	        qualification.sendKeys("Bachelors degree");
	        Thread.sleep(3000);
	        qualification.sendKeys(Keys.ARROW_DOWN);
	        Thread.sleep(2000);
	        qualification.sendKeys(Keys.ENTER);
	        Thread.sleep(4000);	
	}

	@When("^choose Employment type$")
	public void choose_Employment_type() throws Throwable {
		WebElement emptype=driver.findElement(By.linkText("Full-Time"));
		emptype.sendKeys("full time");
		Thread.sleep(4000);
		emptype.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		emptype.sendKeys(Keys.ENTER);
		Thread.sleep(4000);   
	}

	@When("^select minimum experience$")
	public void select_minimum_experience() throws Throwable {
		driver.findElement(By.id("minExp")).sendKeys("1");
		Thread.sleep(4000);   
	}

	@When("^select maximum experience$")
	public void select_maximum_experience() throws Throwable {
		driver.findElement(By.id("maxExp")).sendKeys("3"); 
		Thread.sleep(4000);
	}

	@When("^add no of vacancies$")
	public void add_no_of_vacancies() throws Throwable {
		WebElement vacancies=driver.findElement(By.xpath("//input[@id='noOfVacancies']"));
		vacancies.click();
		Thread.sleep(2000);
		vacancies.sendKeys("5");
		Thread.sleep(2000);
	}

	@When("^add Job Discription$")
	public void add_Job_Discription() throws Throwable {
		driver.findElement(By.xpath("//div[@placeholder='Enter description']")).sendKeys("writing test cases,Exploratory Testing,Automation Testing");
		Thread.sleep(2000);   
	}

	@When("^add Job Requirements$")
	public void add_Job_Requirements() throws Throwable {
		driver.findElement(By.xpath("//div[@placeholder='Enter requirements']")).sendKeys("candidates should join immediately,candidates should have knowledge on selenium and core java");
		Thread.sleep(2000);  
	}

}



