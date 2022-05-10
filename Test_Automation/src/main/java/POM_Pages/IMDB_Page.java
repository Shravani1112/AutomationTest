package POM_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class IMDB_Page extends BaseClass {

	//xpath of web elements
	
	@FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[24]")
	WebElement releaseDate;

	@FindBy(xpath = "(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[25]")
	WebElement country;

	// initializing web elements
	
	public IMDB_Page() {
		PageFactory.initElements(driver, this);

	}

	public String date1;
	public String country1;
	
	// Method to launch IMDB page URL and locate web elements:
	
	public  void launch_IMDB_Page() {
		
		driver.get("https://www.imdb.com/title/tt9389998/");
		
		date1 = releaseDate.getText();
		System.out.println(date1);

		country1 = country.getText();
		System.out.println(country1);

	}

}
