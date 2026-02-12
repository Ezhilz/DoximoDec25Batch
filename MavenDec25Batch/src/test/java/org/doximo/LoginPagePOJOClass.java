package org.doximo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOJOClass extends BaseClass {
	
	public LoginPagePOJOClass() {
		PageFactory.initElements(driver,this);
	}
	//Declare web element as private
	@FindBy(id="email")
	private List<WebElement> txtUser;
	
	@FindBy(id="pass")
	private List<WebElement> txtPass;
	
	@FindBy(xpath="//button[@type='submit']")
	private List<WebElement> btn;

	public List<WebElement> getTxtUser() {
		return txtUser;
	}

	public List<WebElement> getTxtPass() {
		return txtPass;
	}

	public List<WebElement> getBtn() {
		return btn;
	}
	
	
}
