package scripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pomPages.PlayandPause;
import pomPages.SkillrarayDemoLogin1;

public class TestCase2  extends BaseClass{
@Test
public void tc2()
{
	SkillrarayDemoLogin1 sd=new SkillrarayDemoLogin1(driver);
	sd.searchtf();
	sd.submit();
	
	PlayandPause p=new PlayandPause(driver);
	driverutilities.switchBack(driver);
	p.cancelbtn();
	p.getPlaybtn();
	p.getPausebtn();
	driverutilities.switchBack(driver);
	
	
}
}
