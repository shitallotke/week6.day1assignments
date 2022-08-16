package week6.day1;

import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;

//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethod{
	@Test
	public  void createLead() {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
}
}



