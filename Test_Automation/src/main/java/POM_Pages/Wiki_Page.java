package POM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Wiki_Page extends BaseClass {

	//xpath of web elements
	
	@FindBy(xpath = "(//div[@class='plainlist'])[4]")
	WebElement releaseDate;

	@FindBy(xpath = "(//td[@class='infobox-data'])[12]")
	WebElement country;

	// initializing web elements
	
	public Wiki_Page() {
		PageFactory.initElements(driver, this);

	}

	public String date2;
	public String country2;
	
	// Method to launch wiki_Page URL and locate web elements:
	
	public void launch_Wiki_Page() {

		driver.navigate().to("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		
		date2 = releaseDate.getText();
		System.out.println(date2);

		country2 = country.getText();
		System.out.println(country2);
	}

}
