package org.stepdefinition;

import org.base.BaseClass11;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnsiginPojo extends BaseClass11 {
	public AnsiginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[@class='nav-line-1 nav-progressive-content'])[2]")
	private WebElement signin;
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	@FindBy(id = "continue")
	private WebElement continuebutton;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}
}
