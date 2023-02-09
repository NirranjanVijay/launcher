package week4.day1;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class LaunchBrowser {
         public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			//verify the page
			String text=driver.findElement(By.tagName("h2")).getText();
			//click on crmsfa hyperlink
			System.out.println(text);
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nirranjan");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("NrnjnVj");
			driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Engineer");
			driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
			driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1101");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("I am a software tester");
			driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("nil");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Vijay");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
			driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("22");
			driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Leo");
			driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("11/19");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("p.nirranjanvj@gmail.com");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8667322273");
			driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Panneer Selvam");
			driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("27/10 Madely Second Street");
			driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
			driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600017");
			driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Karthik Kumar");
			driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("T.Nagar");
			
			}

	}

	}
