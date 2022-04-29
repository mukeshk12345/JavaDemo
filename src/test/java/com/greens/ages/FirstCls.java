package com.greens.ages;

import org.bouncycastle.jcajce.provider.asymmetric.dh.BCDHPublicKey;
import org.bouncycastle.util.IPAddress;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;
import com.greens.utils.BaseClass;

public class FirstCls extends BaseClass {
	
	 LoginPage lp;
	
@Test
 public void sample()
 {
	launchBrowser("chrome");
	lp=new LoginPage();
	maxi();
	iwait(15);
	openApp("https://www.facebook.com/");
	send(lp.getUser(),"admin");
	send(lp.getPswd(), "12345");
	tap(lp.getLogin());
	driver.close();
	
	
	
	
}
}