package objectrepository;
/**
 * @author RamyavaniMathavan
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {
/**
 * This method gives Home page locators values
 */
	
	WebDriver driver=new ChromeDriver();
	
	@FindBy(partialLinkText = "Books")
	private WebElement Bookslinks;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement Computerslink;
	
	@FindBy(partialLinkText = "Electronics")
	private WebElement Electronicslink;
	
	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement ApparelShoeslink;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement Digitaldownloadslink;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement Jewelrylinks;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement GiftCardslink;

	@FindBy(partialLinkText = "Logout")
	private WebElement Logoutlink;


	public Homepage(WebDriver driver) {
	
		PageFactory.initElements(driver,this);
	}


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getBookslinks() {
		return Bookslinks;
	}


	public WebElement getComputerslink() {
		return Computerslink;
	}


	public WebElement getElectronicslink() {
		return Electronicslink;
	}


	public WebElement getApparelShoeslink() {
		return ApparelShoeslink;
	}


	public WebElement getDigitaldownloadslink() {
		return Digitaldownloadslink;
	}


	public WebElement getJewelrylinks() {
		return Jewelrylinks;
	}


	public WebElement getGiftCardslink() {
		return GiftCardslink;
	}


	public WebElement getLogoutlink() {
		return Logoutlink;
	}

	
	}
	
	



