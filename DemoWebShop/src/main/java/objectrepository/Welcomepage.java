package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author RamyavaniMathavan
 */
public class Welcomepage {

	/**
	 * This method gives Welcome page locators values
	 */
	@FindBy (partialLinkText = "Register")
	private WebElement registerlink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement loginlink;
	
	@FindBy(partialLinkText = "Shopping cart")
	private WebElement Shoppingcartlink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement Wishlistlink;
	
	public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getLoginlink() {
		return loginlink;
	}

	public WebElement getShoppingcartlink() {
		return Shoppingcartlink;
	}

	public WebElement getWishlistlink() {
		return Wishlistlink;
	}
	
}


