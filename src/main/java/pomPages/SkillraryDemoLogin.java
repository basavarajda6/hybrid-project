package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLogin {
 @FindBy(id="course")
 private WebElement coursetab;
 
 @FindBy(xpath="(//a[text()='Selenium Training'])[2]")
 private WebElement seleniumtraining;
 
 
 @FindBy(name="addresstype")
 private WebElement typing;
 

public SkillraryDemoLogin(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

public WebElement getTyping() {
	return typing;
}


public WebElement getCoursetab() {
	return coursetab;
}
public void selenium()
{
	seleniumtraining.click();
}
}
