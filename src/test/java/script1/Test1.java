package script1;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generics.BaseTest;

public class Test1 extends BaseTest{
	
	@Test
	public void testA()
	{
		Reporter.log("Test A Method", true);
	}

}
