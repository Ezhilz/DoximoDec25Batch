package org.doximo;

import org.openqa.selenium.WebElement;

public class SampleMain extends BaseClass {

	public static void main(String[] args) {
		launchBrowser();
		maximizeWindow();
		loadUrl("https://www.facebook.com/");
		LoginPagePOJOClass l=new LoginPagePOJOClass();
		types(l.getTxtUser().get(0),"Arunkumar");
		types(l.getTxtPass().get(0),"Arun@123");
		btnLogin(l.getBtn().get(0));
		quitBrowser();

	}

}
