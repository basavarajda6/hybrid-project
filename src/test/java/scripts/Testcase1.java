package scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{
@Test
public void tc1()
{
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	s.gearsbtn();
	s.skillraryDemoApp();
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutilities.switchTabs(driver);
	driverutilities.mousehover(driver, sd.getCoursetab());
	sd.selenium();
	
	AddtoCartPage ad=new AddtoCartPage(driver);
	driverutilities.doubleClick(driver, ad.getAddbtn());
	ad.addtocart();
	driverutilities.alertPopupp(driver);
}
}
