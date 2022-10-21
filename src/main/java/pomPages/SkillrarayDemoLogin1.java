package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarayDemoLogin1 {
@FindBy(name="q")
private WebElement searchtf;

@FindBy(xpath="//input[@type='submit']")
private WebElement submit;

@FindBy(xpath="//a[text()='X']")
private WebElement cancel;

public SkillrarayDemoLogin1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void searchtf()
{
	searchtf.sendKeys("core java for selenium");
}
public void submit()
{
	submit.click();
}
}
