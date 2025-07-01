package genericutility;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
/**
 * @author RamyavaniMathavan
 */
import org.openqa.selenium.support.ui.Select;

public class webDriverutility {

	/**
	 * This method is used to maximize the window
	 * 
	 * @param driver
	 */

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void MouseHover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void ClickandHold(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.clickAndHold(element).perform();
	}

	public void dragandDrop(WebDriver driver, WebElement source, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}

	public void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element);
	}

	public void selectbyIndex(WebElement element, int index) {
		Select refvar = new Select(element);
		refvar.selectByIndex(index);
	}

	public void selectbyValue(WebElement element, String value) {
		Select refvar = new Select(element);
		refvar.selectByValue(value);
	}

	public void selectbyVisibleText(WebElement element, String Text) {
		Select refvar = new Select(element);
		refvar.selectByVisibleText(Text);
	}

	public String[] getAlloptions(WebElement element) {
		Select refvar = new Select(element);
		List<WebElement> alloptions = refvar.getOptions();
		String[] options = new String[alloptions.size()];

		for (int i = 0; i < alloptions.size(); i++) {
			options[i] = alloptions.get(i).getText();
		}
		return options;
	}

	public void SwitchToFrame(int index, WebDriver driver) {
		driver.switchTo().frame(index);

	}

	public void SwitchToFrame(WebDriver driver, String nameorId) {
		driver.switchTo().frame(nameorId);
	}

	public void SwitchToFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void SwitchBackToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}

	public void switchtowindow(WebDriver driver, String expurl) {
		Set<String> AllWindowIDS = driver.getWindowHandles();
		for (String IDS : AllWindowIDS) {
			driver.switchTo().window(IDS);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains(expurl)) {
				break;
			}
		}
	}

	public void getphoto(WebDriver driver) throws IOException {
		javautility jutility = new javautility();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + jutility.getsystemTime() + ".png");
		FileHandler.copy(temp, dest);
	}

	public void jsscroll(WebDriver driver, int X, int Y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(" + X + "" + Y + ")");
	}

}
