package org.zoomcar.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartPage {
	ChromeDriver driver=new ChromeDriver();
	
	public StartPage clickstartpoint()
	{
		driver.findElementByXPath("//div[@class='component-popular-locations']//div[2]\r\n").click();
		return this;
		
	}
	public PickupPage clickNext()
	{
		driver.findElementByXPath("//button[text()='Next']").click();	
		return new PickupPage();
	}

}
