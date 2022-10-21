package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class TestCase3 extends BaseClass{
@Test
public void tc3() throws IOException
{
SkillraryLoginPage sl=new SkillraryLoginPage(driver);
sl.gearsbtn();
sl.skillraryDemoApp();

SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
driverutilities.switchTabs(driver);
driverutilities.dropdown(sd.getTyping(), pdata.getData("course"));

CoursePage c=new CoursePage(driver);
driverutilities.draganddrop(driver, c.getSelenium(),c.getDrag());
WebElement loc = c.getLinkedin();
Point coordinates = loc.getLocation();
int x = coordinates.getX();
int y = coordinates.getY();
driverutilities.scrollBar(driver, x, y);
c.linkedin();
}
}
