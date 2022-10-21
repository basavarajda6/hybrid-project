package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlayandPause {
	
@FindBy(xpath="//a[text()='X']")
private WebElement cancelbtn;

@FindBy(xpath="//div[@class='play-icon']")
private WebElement playbtn;

@FindBy(xpath="//div[@class='pause-icon']")
private WebElement pausebtn;

public PlayandPause(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void switchframe()
{
	switchframe();
}
public void cancelbtn()
{
	cancelbtn.click();
}
public WebElement getPlaybtn() {
	return playbtn;
}
public WebElement getPausebtn() {
	return pausebtn;
}
public void switchbackfromFrame()
{
	switchbackfromFrame();
}
}
