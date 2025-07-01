package books;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import genericutility.BaseClass;
import genericutility.Listernerutility;
import objectrepository.Homepage;


@Listeners(Listernerutility.class)

public class TC_DWS_001_Test extends BaseClass {
	
	@Test
	
	public void clickonBooks() {
		
		
		Homepage hp= new Homepage(driver);
		hp.getBookslinks().click();
		Assert.assertEquals(driver.getTitle(),"Demo web shop.Books","Books page is not Displayed");
		test.log(Status.PASS,"Books page is Displayed");
	}

}
