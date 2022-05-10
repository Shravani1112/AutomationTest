import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseClass;
import POM_Pages.IMDB_Page;
import POM_Pages.Wiki_Page;

public class TestClass extends BaseClass {

	IMDB_Page imdb_page;
	Wiki_Page wiki_page;

	public TestClass() {
		super();
	}

	@BeforeTest
	public void setUp() {
		initialization();
		imdb_page = new IMDB_Page();
		wiki_page = new Wiki_Page();
	}

	@Test
	// Testcase 1 - To Compare release dates from IMDB page & Wiki Page
	public void TestCase1() {
		imdb_page.launch_IMDB_Page();
		wiki_page.launch_Wiki_Page();

		String D1 = imdb_page.date1;
		String D2 = wiki_page.date2;
		
		assertEquals(D1, D2);
	}

	@Test
	// Testcase 2 - To Compare country name from IMDB page & Wiki Page
	public void TestCase2() {

		imdb_page.launch_IMDB_Page();
		wiki_page.launch_Wiki_Page();

		String C1 = imdb_page.country1;
		String C2 = wiki_page.country2;
		
		assertEquals(C1, C2);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
