package  week2.day2.Assignments;

public class DeleteLead {
	
		/*http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		
		public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
		
		2	Enter the username
		
		WebElement elementUsername =driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
		
		3	Enter the password
		
		WebElement elementPassword =driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
		
		4	Click Login
		
		WebElement elementLogin =driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
		
		5	Click crm/sfa link
		
			WebElement elementCRMSFA =driver.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
		
		6	Click Leads link
		
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
	elementLeads.click();
		
		7	Click Find leads
		
		 WebElement elementFindLeads = driver.findElement(By.linkText("Find Leads"));
	elementFindLeads.click();
		
		8	Click on Phone
		
		Thread.sleep(5000);
	 WebElement elementPhone = driver.findElement(By.linkText("Phone"));
		elementPhone.click();
		
		9	Enter phone number
		
		WebElement elementPhoneNumber =driver.findElement(By.id("ext-gen270"));
		elementPhoneNumber.sendKeys("99");
		
		10	Click find leads button
		
			WebElement elementLeadsButton =driver.findElement(By.id("ext-gen334"));
		elementLeadsButton.click();
	
		
		11	Capture lead ID of First Resulting lead
		
		Thread.sleep(5000);
		List<WebElement> elementFirstResultingLeadrows =	driver.findElements(By.xpath("(//table)[22]/tbody/tr[1]"));
		
		List<WebElement> elementFirstResultingLeadcols =	driver.findElements(By.xpath("(//table)[22]/tbody/tr[1]/td[1]"));
	
		WebElement elementFirstID =driver.findElement(By.linkText("10836"));
		String firstID = elementFirstID.getText();
		elementFirstID.sendKeys(firstID);
		
		12	Click First Resulting lead
		
		for(int i=1; i<=1; i++) {
			
			for(int j = 1; j<=elementFirstResultingLeadcols.size(); j++) {
			
				
			driver.findElement(By.linkText("10836")).click();	
			}
		}
		
		13	Click Delete
		
		WebElement elementEdit = driver.findElement(By.linkText("Delete"));
			elementEdit.click();
		
		14	Click Find leads
		
		 WebElement elementFindLeads1 = driver.findElement(By.linkText("Find Leads"));
				elementFindLeads1.click();
		
		15	Enter captured lead ID
				
				WebElement elementLeadId =driver.findElement(By.id("ext-gen246"));
				elementLeadId.sendKeys(firstID);
		
		16	Click find leads button
		
				WebElement elementLeadsButton1 =driver.findElement(By.id("ext-gen334"));
				elementLeadsButton1.click();
		
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		
		List<WebElement> elementFirstResultingLeadrows1 =	driver.findElements(By.xpath("(//table)[22]/tbody/tr[1]"));
				
				List<WebElement> elementFirstResultingLeadcols1 =	driver.findElements(By.xpath("(//table)[22]/tbody/tr[1]/td[1]"));
			
				boolean isvisible = ((WebElement) elementFirstResultingLeadcols1).isDisplayed();
			System.out.println(driver.findElement(By.linkText("10836")).isDisplayed());
			
		18	Close the browser (Do not log out)
		
		driver.quit();
*/
	}
}
