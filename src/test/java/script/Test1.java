package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;

public class Test1  extends BaseTest{
	
	
	@Test
	public void testA()
	{
		Reporter.log("testA",true);
	}

}
