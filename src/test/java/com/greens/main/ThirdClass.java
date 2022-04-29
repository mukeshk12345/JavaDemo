package com.greens.main;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.greens.ages.LoginPage;
import com.greens.utils.BaseClass;

public class ThirdClass extends BaseClass {
	
	LoginPage lp;
	
	
	@DataProvider(name = "testdata")
	public Object[][] data()
	{
	  return new Object[][]  {{"mukesh", "mukesh12345"},{"admin","admin123"}};

		
	}
	
	
	
@BeforeClass
@Parameters("browser")
public void sample1(String s)
{
	launchBrowser(s);
	lp=new LoginPage();
}

@AfterClass
public void sample2()
{
	driver.quit();
}

@BeforeMethod
@Parameters("url")
public void sample3(String s)
{
	openApp(s);
}

@AfterMethod
public void sample4()
{
	
}

@Test(dataProvider = "testdata")
public void sample5(String username,String pswd)
{
	send(lp.getUser(), "username");
	send(lp.getPswd(), "pswd");
	tap(lp.getLogin());
	
	
	
	
	
	
	
	
}

}
