import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataDriven_TestNG 
{
	private webdriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) 
  {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() 
  {
	  driver = new FirefoxDriver();
	  driver.get("");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }


}